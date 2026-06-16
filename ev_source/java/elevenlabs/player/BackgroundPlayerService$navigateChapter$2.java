package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.services.ReadsService;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import sn.z;
import tn.o;
import w7.r0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$navigateChapter$2", f = "BackgroundPlayerService.kt", l = {1570}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$navigateChapter$2 extends i implements p {
    final /* synthetic */ int $direction;
    Object L$0;
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$navigateChapter$2(BackgroundPlayerService backgroundPlayerService, int i10, wn.c<? super BackgroundPlayerService$navigateChapter$2> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
        this.$direction = i10;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerService$navigateChapter$2(this.this$0, this.$direction, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$navigateChapter$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        boolean isAudioTransport;
        int currentTtsChapterIndex;
        boolean z6;
        String str;
        TtsAwareForwardingPlayer ttsAwareForwardingPlayer;
        int i10 = this.label;
        z zVar = z.f31622a;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                r0Var = (r0) this.L$0;
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            r0Var = (r0) this.this$0.currentMediaItem.getValue();
            if (r0Var != null) {
                ReadsService readsService = this.this$0.getReadsService();
                String str2 = r0Var.f36578a;
                str2.getClass();
                this.L$0 = r0Var;
                this.label = 1;
                obj = readsService.getRead(str2, this);
                xn.a aVar = xn.a.f37986a;
                if (obj == aVar) {
                    return aVar;
                }
            }
            return zVar;
        }
        ReadMeta readMeta = (ReadMeta) obj;
        if (readMeta != null) {
            isAudioTransport = BackgroundPlayerServiceKt.isAudioTransport(r0Var);
            if (ReadMetaKt.isMediaType(readMeta) && isAudioTransport) {
                z10 = this.this$0.navigateAudioChapter(this.$direction);
            } else {
                if (!readMeta.getChapters().isEmpty()) {
                    currentTtsChapterIndex = this.this$0.getCurrentTtsChapterIndex(readMeta);
                    Chapter chapter = (Chapter) o.z0(currentTtsChapterIndex, readMeta.getChapters());
                    if (this.$direction < 0 && chapter != null) {
                        ttsAwareForwardingPlayer = this.this$0.ttsAwarePlayer;
                        if (ttsAwareForwardingPlayer != null) {
                            if (ttsAwareForwardingPlayer.getCurrentCharOffset() - chapter.getStartingCharOffset() > 100) {
                                z6 = true;
                                if (!z6) {
                                    currentTtsChapterIndex += this.$direction;
                                }
                                if (currentTtsChapterIndex >= 0 && currentTtsChapterIndex < readMeta.getChapters().size()) {
                                    Chapter chapter2 = readMeta.getChapters().get(currentTtsChapterIndex);
                                    BackgroundPlayerService.seekToTtsOffset$default(this.this$0, false, new b(chapter2, 0), 1, null);
                                    Logger logger = this.this$0.getLogger();
                                    String str3 = this.this$0.tag;
                                    if (this.$direction <= 0) {
                                        str = "next";
                                    } else if (z6) {
                                        str = "restart";
                                    } else {
                                        str = "previous";
                                    }
                                    logger.log(str3, defpackage.f.k("Seek to ", str, " TTS chapter: ", chapter2.getChapterName()));
                                }
                            }
                        } else {
                            m.i("ttsAwarePlayer");
                            throw null;
                        }
                    }
                    z6 = false;
                    if (!z6) {
                    }
                    if (currentTtsChapterIndex >= 0) {
                        Chapter chapter22 = readMeta.getChapters().get(currentTtsChapterIndex);
                        BackgroundPlayerService.seekToTtsOffset$default(this.this$0, false, new b(chapter22, 0), 1, null);
                        Logger logger2 = this.this$0.getLogger();
                        String str32 = this.this$0.tag;
                        if (this.$direction <= 0) {
                        }
                        logger2.log(str32, defpackage.f.k("Seek to ", str, " TTS chapter: ", chapter22.getChapterName()));
                    }
                }
                z10 = false;
            }
            if (z10) {
                this.this$0.getVibrationService().vibrateShort();
                this.this$0.getAnalytics().log(Analytics.Event.PlayerClickedJumpToChapter.INSTANCE);
            }
        }
        return zVar;
    }
}
