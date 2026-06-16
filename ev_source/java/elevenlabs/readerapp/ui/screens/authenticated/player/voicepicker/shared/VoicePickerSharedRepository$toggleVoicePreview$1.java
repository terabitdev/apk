package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import com.google.protobuf.c6;
import fr.d0;
import fr.k1;
import ho.p;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository$toggleVoicePreview$1", f = "VoicePickerSharedRepository.kt", l = {399, 407, 409}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerSharedRepository$toggleVoicePreview$1 extends yn.i implements p {
    final /* synthetic */ boolean $isStopping;
    final /* synthetic */ k1 $oldJob;
    final /* synthetic */ Voice $voice;
    Object L$0;
    int label;
    final /* synthetic */ VoicePickerSharedRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerSharedRepository$toggleVoicePreview$1(k1 k1Var, boolean z6, VoicePickerSharedRepository voicePickerSharedRepository, Voice voice, wn.c<? super VoicePickerSharedRepository$toggleVoicePreview$1> cVar) {
        super(2, cVar);
        this.$oldJob = k1Var;
        this.$isStopping = z6;
        this.this$0 = voicePickerSharedRepository;
        this.$voice = voice;
    }

    public static final VoicePickerSharedContract.State invokeSuspend$lambda$0(Voice voice, VoicePickerSharedContract.State state) {
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, null, voice.getVoiceId(), false, null, false, null, null, null, null, false, 8175, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerSharedRepository$toggleVoicePreview$1(this.$oldJob, this.$isStopping, this.this$0, this.$voice, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerSharedRepository$toggleVoicePreview$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (r8 == r5) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0038, code lost:
    
        if (fr.g0.k(r8, r7) == r5) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0015, B:9:0x0070, B:11:0x0074, B:20:0x0023, B:21:0x005a, B:23:0x005e, B:29:0x0040), top: B:2:0x0009 }] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        AudioPreviewService audioPreviewService;
        StringProvider stringProvider;
        int i10 = this.label;
        z zVar = z.f31622a;
        xn.a aVar = xn.a.f37986a;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            sn.a.g(obj);
                            if (obj instanceof AsyncCallResult.Error) {
                                VoicePickerSharedRepository voicePickerSharedRepository = this.this$0;
                                stringProvider = voicePickerSharedRepository.stringProvider;
                                voicePickerSharedRepository.showErrorToast(stringProvider.getString(R.string.voices_error_playing_preview));
                            }
                            return zVar;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                    str = (String) obj;
                    if (str != null) {
                        audioPreviewService = this.this$0.audioPreviewService;
                        this.L$0 = null;
                        this.label = 3;
                        obj = audioPreviewService.play(str, this);
                    }
                    return zVar;
                }
                sn.a.g(obj);
            } else {
                sn.a.g(obj);
                k1 k1Var = this.$oldJob;
                if (k1Var != null) {
                    this.label = 1;
                }
            }
            if (!this.$isStopping) {
                this.this$0.updateState(new i(this.$voice, 1));
                VoicePickerSharedRepository voicePickerSharedRepository2 = this.this$0;
                Voice voice = this.$voice;
                this.label = 2;
                obj = voicePickerSharedRepository2.resolvePreviewUrl(voice, this);
                if (obj == aVar) {
                    return aVar;
                }
                str = (String) obj;
                if (str != null) {
                }
            }
            return zVar;
        } finally {
            if (m.c(((VoicePickerSharedContract.State) this.this$0.getStateFlow().getValue()).getPlayingPreviewVoiceId(), this.$voice.getVoiceId())) {
                this.this$0.updateState(new j(0));
            }
        }
    }
}
