package io.elevenlabs.readerapp.usecase;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import ho.l;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.domain.services.PronunciationsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.PlayPronunciationPreviewUseCase;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJD\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0096B¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001e¨\u0006 "}, d2 = {"Lio/elevenlabs/readerapp/usecase/PlayPronunciationPreviewUseCaseImpl;", "Lio/elevenlabs/domain/usecase/PlayPronunciationPreviewUseCase;", "Lio/elevenlabs/domain/services/PronunciationsService;", "pronunciationsService", "Lio/elevenlabs/domain/services/AudioPreviewService;", "audioPreviewService", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/services/PronunciationsService;Lio/elevenlabs/domain/services/AudioPreviewService;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/Logger;)V", "", ParameterNames.TEXT, "voiceId", "Lio/elevenlabs/domain/model/PronunciationPreviewState;", "currentState", "Lkotlin/Function1;", "Lsn/z;", "onStateUpdate", "", "forcePlay", "invoke", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/PronunciationPreviewState;Lho/l;ZLwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/services/PronunciationsService;", "Lio/elevenlabs/domain/services/AudioPreviewService;", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/Logger;", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayPronunciationPreviewUseCaseImpl implements PlayPronunciationPreviewUseCase {
    private static final String TAG = "PlayPronunciationPreviewUseCase";
    private final AudioPreviewService audioPreviewService;
    private final Logger logger;
    private final PronunciationsService pronunciationsService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final ToastService toastService;
    public static final int $stable = 8;

    public PlayPronunciationPreviewUseCaseImpl(PronunciationsService pronunciationsService, AudioPreviewService audioPreviewService, ToastService toastService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Logger logger) {
        pronunciationsService.getClass();
        audioPreviewService.getClass();
        toastService.getClass();
        resolveErrorMessageUseCase.getClass();
        logger.getClass();
        this.pronunciationsService = pronunciationsService;
        this.audioPreviewService = audioPreviewService;
        this.toastService = toastService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.logger = logger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x010f, code lost:
    
        if (r0 == r8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e5, code lost:
    
        if (r0 == r8) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // io.elevenlabs.domain.usecase.PlayPronunciationPreviewUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(String str, String str2, PronunciationPreviewState pronunciationPreviewState, l lVar, boolean z6, c<? super z> cVar) {
        PlayPronunciationPreviewUseCaseImpl$invoke$1 playPronunciationPreviewUseCaseImpl$invoke$1;
        int i10;
        boolean z10;
        String str3;
        l lVar2;
        String str4;
        l lVar3;
        if (cVar instanceof PlayPronunciationPreviewUseCaseImpl$invoke$1) {
            playPronunciationPreviewUseCaseImpl$invoke$1 = (PlayPronunciationPreviewUseCaseImpl$invoke$1) cVar;
            int i11 = playPronunciationPreviewUseCaseImpl$invoke$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                playPronunciationPreviewUseCaseImpl$invoke$1.label = i11 - Integer.MIN_VALUE;
                Object obj = playPronunciationPreviewUseCaseImpl$invoke$1.result;
                i10 = playPronunciationPreviewUseCaseImpl$invoke$1.label;
                z zVar = z.f31622a;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                lVar3 = (l) playPronunciationPreviewUseCaseImpl$invoke$1.L$3;
                                sn.a.g(obj);
                                AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
                                if (asyncCallResult instanceof AsyncCallResult.Success) {
                                    lVar3.invoke(PronunciationPreviewState.Stopped);
                                } else if (asyncCallResult instanceof AsyncCallResult.Error) {
                                    lVar3.invoke(PronunciationPreviewState.Stopped);
                                    ToastService.showToast$default(this.toastService, ResolveErrorMessageUseCase.invoke$default(this.resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
                                } else {
                                    c6.p();
                                    return null;
                                }
                                return zVar;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z11 = playPronunciationPreviewUseCaseImpl$invoke$1.Z$0;
                        lVar2 = (l) playPronunciationPreviewUseCaseImpl$invoke$1.L$3;
                        sn.a.g(obj);
                        z10 = z11;
                        lVar3 = lVar2;
                        AsyncCallResult asyncCallResult2 = (AsyncCallResult) obj;
                        if (asyncCallResult2 instanceof AsyncCallResult.Success) {
                            lVar3.invoke(PronunciationPreviewState.Playing);
                            AudioPreviewService audioPreviewService = this.audioPreviewService;
                            String str5 = (String) ((AsyncCallResult.Success) asyncCallResult2).getData();
                            playPronunciationPreviewUseCaseImpl$invoke$1.L$0 = null;
                            playPronunciationPreviewUseCaseImpl$invoke$1.L$1 = null;
                            playPronunciationPreviewUseCaseImpl$invoke$1.L$2 = null;
                            playPronunciationPreviewUseCaseImpl$invoke$1.L$3 = lVar3;
                            playPronunciationPreviewUseCaseImpl$invoke$1.L$4 = null;
                            playPronunciationPreviewUseCaseImpl$invoke$1.Z$0 = z10;
                            playPronunciationPreviewUseCaseImpl$invoke$1.label = 3;
                            obj = audioPreviewService.play(str5, playPronunciationPreviewUseCaseImpl$invoke$1);
                        } else {
                            if (asyncCallResult2 instanceof AsyncCallResult.Error) {
                                lVar3.invoke(PronunciationPreviewState.Stopped);
                                ToastService.showToast$default(this.toastService, ResolveErrorMessageUseCase.invoke$default(this.resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult2, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
                                return zVar;
                            }
                            c6.p();
                            return null;
                        }
                    } else {
                        boolean z12 = playPronunciationPreviewUseCaseImpl$invoke$1.Z$0;
                        lVar2 = (l) playPronunciationPreviewUseCaseImpl$invoke$1.L$3;
                        str3 = (String) playPronunciationPreviewUseCaseImpl$invoke$1.L$1;
                        str4 = (String) playPronunciationPreviewUseCaseImpl$invoke$1.L$0;
                        sn.a.g(obj);
                        z10 = z12;
                    }
                } else {
                    sn.a.g(obj);
                    if (pronunciationPreviewState == PronunciationPreviewState.Playing) {
                        AudioPreviewService audioPreviewService2 = this.audioPreviewService;
                        playPronunciationPreviewUseCaseImpl$invoke$1.L$0 = str;
                        playPronunciationPreviewUseCaseImpl$invoke$1.L$1 = str2;
                        playPronunciationPreviewUseCaseImpl$invoke$1.L$2 = null;
                        playPronunciationPreviewUseCaseImpl$invoke$1.L$3 = lVar;
                        z10 = z6;
                        playPronunciationPreviewUseCaseImpl$invoke$1.Z$0 = z10;
                        playPronunciationPreviewUseCaseImpl$invoke$1.label = 1;
                        if (audioPreviewService2.stop(playPronunciationPreviewUseCaseImpl$invoke$1) != aVar) {
                            str3 = str2;
                            lVar2 = lVar;
                            str4 = str;
                        }
                        return aVar;
                    }
                    z10 = z6;
                    str3 = str2;
                    lVar2 = lVar;
                    str4 = str;
                    if (str4.length() == 0) {
                        Logger.logWarning$default(this.logger, TAG, "Cannot preview empty text", null, 4, null);
                        return zVar;
                    }
                    lVar2.invoke(PronunciationPreviewState.Loading);
                    PronunciationsService pronunciationsService = this.pronunciationsService;
                    playPronunciationPreviewUseCaseImpl$invoke$1.L$0 = null;
                    playPronunciationPreviewUseCaseImpl$invoke$1.L$1 = null;
                    playPronunciationPreviewUseCaseImpl$invoke$1.L$2 = null;
                    playPronunciationPreviewUseCaseImpl$invoke$1.L$3 = lVar2;
                    playPronunciationPreviewUseCaseImpl$invoke$1.Z$0 = z10;
                    playPronunciationPreviewUseCaseImpl$invoke$1.label = 2;
                    obj = pronunciationsService.generatePreviewUrl(str4, str3, playPronunciationPreviewUseCaseImpl$invoke$1);
                }
                lVar2.invoke(PronunciationPreviewState.Stopped);
                if (!z10) {
                    return zVar;
                }
                if (str4.length() == 0) {
                }
            }
        }
        playPronunciationPreviewUseCaseImpl$invoke$1 = new PlayPronunciationPreviewUseCaseImpl$invoke$1(this, cVar);
        Object obj2 = playPronunciationPreviewUseCaseImpl$invoke$1.result;
        i10 = playPronunciationPreviewUseCaseImpl$invoke$1.label;
        z zVar2 = z.f31622a;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        lVar2.invoke(PronunciationPreviewState.Stopped);
        if (!z10) {
        }
        if (str4.length() == 0) {
        }
    }
}
