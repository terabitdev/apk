package io.elevenlabs.player;

import ae.l;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.p;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ChapterUtilsKt;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.model.TtsTimeConversion;
import io.elevenlabs.domain.services.ReadsService;
import io.livekit.android.room.SignalClient;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import sn.k;
import sn.z;
import tn.o;
import w7.r0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$seekBySeconds$1", f = "BackgroundPlayerService.kt", l = {635, 644}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$seekBySeconds$1 extends i implements p {
    final /* synthetic */ int $seconds;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$seekBySeconds$1$1", f = "BackgroundPlayerService.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.player.BackgroundPlayerService$seekBySeconds$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ ReadMeta $read;
        final /* synthetic */ int $seconds;
        int label;
        final /* synthetic */ BackgroundPlayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BackgroundPlayerService backgroundPlayerService, ReadMeta readMeta, int i10, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = backgroundPlayerService;
            this.$read = readMeta;
            this.$seconds = i10;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(this.this$0, this.$read, this.$seconds, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            int currentWindowIndex;
            double d10;
            if (this.label == 0) {
                sn.a.g(obj);
                currentWindowIndex = this.this$0.getCurrentWindowIndex(this.$read);
                long currentPosition = this.this$0.getPlayer().getCurrentPosition();
                if (currentPosition < 0) {
                    currentPosition = 0;
                }
                double cumulativeChapterDuration = (currentPosition / 1000.0d) + ChapterUtilsKt.getCumulativeChapterDuration(this.$read.getChapters(), currentWindowIndex);
                Iterator<T> it = this.$read.getChapters().iterator();
                double d11 = 0.0d;
                while (it.hasNext()) {
                    Double durationSeconds = ((Chapter) it.next()).getDurationSeconds();
                    if (durationSeconds != null) {
                        d10 = durationSeconds.doubleValue();
                    } else {
                        d10 = 0.0d;
                    }
                    d11 += d10;
                }
                k findChapterAtPosition = ChapterUtilsKt.findChapterAtPosition(this.$read.getChapters(), l.k(cumulativeChapterDuration + this.$seconds, 0.0d, d11));
                Chapter chapter = (Chapter) findChapterAtPosition.f31600a;
                double doubleValue = ((Number) findChapterAtPosition.f31601b).doubleValue();
                List<Chapter> chapters = this.$read.getChapters();
                chapters.getClass();
                int indexOf = chapters.indexOf(chapter);
                if (indexOf < 0) {
                    indexOf = 0;
                }
                this.this$0.getPlayer().seekTo(indexOf, (long) (SignalClient.CLOSE_REASON_NORMAL_CLOSURE * doubleValue));
                this.this$0.getSeekEmitter().updateAudioPositionWithChapter(doubleValue, (Chapter) o.z0(indexOf, this.$read.getChapters()));
                return z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$seekBySeconds$1(BackgroundPlayerService backgroundPlayerService, int i10, wn.c<? super BackgroundPlayerService$seekBySeconds$1> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
        this.$seconds = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invokeSuspend$lambda$0(int i10, BackgroundPlayerService backgroundPlayerService, ReadMeta readMeta) {
        TtsAwareForwardingPlayer ttsAwareForwardingPlayer;
        long secondsToChars = TtsTimeConversion.INSTANCE.secondsToChars(Math.abs(i10)) * Integer.signum(i10);
        ttsAwareForwardingPlayer = backgroundPlayerService.ttsAwarePlayer;
        if (ttsAwareForwardingPlayer != null) {
            return l.p(ttsAwareForwardingPlayer.getCurrentCharOffset() + secondsToChars, new no.i(0L, readMeta.getCharCount()));
        }
        m.i("ttsAwarePlayer");
        throw null;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerService$seekBySeconds$1(this.this$0, this.$seconds, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$seekBySeconds$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (r10 == r4) goto L28;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        boolean isAudioTransport;
        int i10 = this.label;
        z zVar = z.f31622a;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return zVar;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var = (r0) this.L$0;
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            r0Var = (r0) this.this$0.currentMediaItem.getValue();
            if (r0Var != null) {
                ReadsService readsService = this.this$0.getReadsService();
                String str = r0Var.f36578a;
                str.getClass();
                this.L$0 = r0Var;
                this.label = 1;
                obj = readsService.getRead(str, this);
            }
            return zVar;
        }
        ReadMeta readMeta = (ReadMeta) obj;
        if (readMeta != null) {
            isAudioTransport = BackgroundPlayerServiceKt.isAudioTransport(r0Var);
            if (ReadMetaKt.isMediaType(readMeta) && isAudioTransport) {
                if (!readMeta.getChapters().isEmpty()) {
                    fr.z main = this.this$0.getDispatcherFactory().getMain();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, readMeta, this.$seconds, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.Z$0 = isAudioTransport;
                    this.label = 2;
                    if (g0.Q(main, anonymousClass1, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                final BackgroundPlayerService backgroundPlayerService = this.this$0;
                final int i11 = this.$seconds;
                BackgroundPlayerService.seekToTtsOffset$default(backgroundPlayerService, false, new ho.l() { // from class: io.elevenlabs.player.d
                    @Override // ho.l
                    public final Object invoke(Object obj2) {
                        long invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = BackgroundPlayerService$seekBySeconds$1.invokeSuspend$lambda$0(i11, backgroundPlayerService, (ReadMeta) obj2);
                        return Long.valueOf(invokeSuspend$lambda$0);
                    }
                }, 1, null);
                return zVar;
            }
        }
        return zVar;
    }
}
