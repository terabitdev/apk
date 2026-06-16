package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.g0;
import ho.p;
import hr.x;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.player.BackgroundPlayerService;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import sn.z;
import tn.o;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$currentAudioPosition$1", f = "BackgroundPlayerService.kt", l = {906, 912, 922, 936}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhr/x;", "Lio/elevenlabs/player/BackgroundPlayerService$AudioPositionData;", "Lsn/z;", "<anonymous>", "(Lhr/x;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$currentAudioPosition$1 extends i implements p {
    final /* synthetic */ long $delayDuration;
    final /* synthetic */ ReadMeta $readMeta;
    double D$0;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$currentAudioPosition$1(BackgroundPlayerService backgroundPlayerService, ReadMeta readMeta, long j4, wn.c<? super BackgroundPlayerService$currentAudioPosition$1> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
        this.$readMeta = readMeta;
        this.$delayDuration = j4;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        BackgroundPlayerService$currentAudioPosition$1 backgroundPlayerService$currentAudioPosition$1 = new BackgroundPlayerService$currentAudioPosition$1(this.this$0, this.$readMeta, this.$delayDuration, cVar);
        backgroundPlayerService$currentAudioPosition$1.L$0 = obj;
        return backgroundPlayerService$currentAudioPosition$1;
    }

    @Override // ho.p
    public final Object invoke(x xVar, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$currentAudioPosition$1) create(xVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f2, code lost:
    
        if (fr.g0.n(r9, r17) == r8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cc, code lost:
    
        if (((hr.w) r2).f12593d.c(r15, r17) == r8) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3 A[Catch: Exception -> 0x002f, CancellationException -> 0x0032, TryCatch #2 {CancellationException -> 0x0032, Exception -> 0x002f, blocks: (B:12:0x002a, B:17:0x004c, B:20:0x0069, B:23:0x008f, B:25:0x00a3, B:26:0x00a9, B:34:0x0037, B:35:0x003d), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00f2 -> B:15:0x0046). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j4;
        Object obj2;
        Chapter chapter;
        String str;
        Object obj3;
        x xVar = (x) this.L$0;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        try {
        } catch (CancellationException e10) {
            throw e10;
        } catch (Exception e11) {
            ib.i.r("Unexpected error in currentAudioPosition: ", e11.getMessage(), this.this$0.getLogger(), this.this$0.tag);
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        long j10 = this.$delayDuration;
                        this.L$0 = xVar;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                    }
                } else {
                    j4 = this.J$0;
                    sn.a.g(obj);
                    obj2 = obj;
                    int intValue = ((Number) obj2).intValue();
                    chapter = (Chapter) o.z0(intValue, this.$readMeta.getChapters());
                    if (chapter != null) {
                        str = chapter.getAudioFileNumber();
                    } else {
                        str = null;
                    }
                    double d10 = j4 / 1000.0d;
                    BackgroundPlayerService.AudioPositionData audioPositionData = new BackgroundPlayerService.AudioPositionData(str, d10, chapter);
                    this.L$0 = xVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.J$0 = j4;
                    this.I$0 = intValue;
                    this.D$0 = d10;
                    this.label = 3;
                }
            } else {
                sn.a.g(obj);
                obj3 = obj;
                j4 = ((Number) obj3).longValue();
                fr.z main = this.this$0.getDispatcherFactory().getMain();
                BackgroundPlayerService$currentAudioPosition$1$currentWindowIndex$1 backgroundPlayerService$currentAudioPosition$1$currentWindowIndex$1 = new BackgroundPlayerService$currentAudioPosition$1$currentWindowIndex$1(this.this$0, this.$readMeta, null);
                this.L$0 = xVar;
                this.J$0 = j4;
                this.label = 2;
                obj2 = g0.Q(main, backgroundPlayerService$currentAudioPosition$1$currentWindowIndex$1, this);
                if (obj2 == aVar) {
                    return aVar;
                }
                int intValue2 = ((Number) obj2).intValue();
                chapter = (Chapter) o.z0(intValue2, this.$readMeta.getChapters());
                if (chapter != null) {
                }
                double d102 = j4 / 1000.0d;
                BackgroundPlayerService.AudioPositionData audioPositionData2 = new BackgroundPlayerService.AudioPositionData(str, d102, chapter);
                this.L$0 = xVar;
                this.L$1 = null;
                this.L$2 = null;
                this.J$0 = j4;
                this.I$0 = intValue2;
                this.D$0 = d102;
                this.label = 3;
            }
        }
        sn.a.g(obj);
        if (g0.y(xVar)) {
            fr.z main2 = this.this$0.getDispatcherFactory().getMain();
            BackgroundPlayerService$currentAudioPosition$1$currentPosition$1 backgroundPlayerService$currentAudioPosition$1$currentPosition$1 = new BackgroundPlayerService$currentAudioPosition$1$currentPosition$1(this.this$0, null);
            this.L$0 = xVar;
            this.label = 1;
            obj3 = g0.Q(main2, backgroundPlayerService$currentAudioPosition$1$currentPosition$1, this);
            if (obj3 == aVar) {
                return aVar;
            }
            j4 = ((Number) obj3).longValue();
            fr.z main3 = this.this$0.getDispatcherFactory().getMain();
            BackgroundPlayerService$currentAudioPosition$1$currentWindowIndex$1 backgroundPlayerService$currentAudioPosition$1$currentWindowIndex$12 = new BackgroundPlayerService$currentAudioPosition$1$currentWindowIndex$1(this.this$0, this.$readMeta, null);
            this.L$0 = xVar;
            this.J$0 = j4;
            this.label = 2;
            obj2 = g0.Q(main3, backgroundPlayerService$currentAudioPosition$1$currentWindowIndex$12, this);
            if (obj2 == aVar) {
            }
            int intValue22 = ((Number) obj2).intValue();
            chapter = (Chapter) o.z0(intValue22, this.$readMeta.getChapters());
            if (chapter != null) {
            }
            double d1022 = j4 / 1000.0d;
            BackgroundPlayerService.AudioPositionData audioPositionData22 = new BackgroundPlayerService.AudioPositionData(str, d1022, chapter);
            this.L$0 = xVar;
            this.L$1 = null;
            this.L$2 = null;
            this.J$0 = j4;
            this.I$0 = intValue22;
            this.D$0 = d1022;
            this.label = 3;
        } else {
            return z.f31622a;
        }
    }
}
