package io.elevenlabs.player.audio;

import com.google.protobuf.c6;
import fr.a2;
import fr.d0;
import fr.g0;
import ho.p;
import io.elevenlabs.domain.Logger;
import kotlin.Metadata;
import sn.a;
import sn.l;
import sn.m;
import sn.z;
import t2.u;
import w7.h1;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.player.audio.SleepTimerFadeOut$start$1", f = "SleepTimerFadeOut.kt", l = {34, 40, 40}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class SleepTimerFadeOut$start$1 extends i implements p {
    final /* synthetic */ h1 $player;
    float F$0;
    float F$1;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ SleepTimerFadeOut this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.elevenlabs.player.audio.SleepTimerFadeOut$start$1$1", f = "SleepTimerFadeOut.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "Lsn/m;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)Lsn/m;"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.player.audio.SleepTimerFadeOut$start$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ float $originalVolume;
        final /* synthetic */ h1 $player;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(h1 h1Var, float f10, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$player = h1Var;
            this.$originalVolume = f10;
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$player, this.$originalVolume, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, c<? super m> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            Object lVar;
            if (this.label == 0) {
                a.g(obj);
                try {
                    this.$player.setVolume(this.$originalVolume);
                    lVar = z.f31622a;
                } catch (Throwable th) {
                    lVar = new l(th);
                }
                return new m(lVar);
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepTimerFadeOut$start$1(h1 h1Var, SleepTimerFadeOut sleepTimerFadeOut, c<? super SleepTimerFadeOut$start$1> cVar) {
        super(2, cVar);
        this.$player = h1Var;
        this.this$0 = sleepTimerFadeOut;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new SleepTimerFadeOut$start$1(this.$player, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((SleepTimerFadeOut$start$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (fr.g0.Q(r13, r0, r12) == r5) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #0 {all -> 0x002d, blocks: (B:16:0x0029, B:17:0x006b, B:21:0x004a, B:25:0x006d), top: B:15:0x0029 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0068 -> B:17:0x006b). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float volume;
        int i10;
        Logger logger;
        int i11 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th = (Throwable) this.L$0;
                    a.g(obj);
                    throw th;
                }
                a.g(obj);
                return z.f31622a;
            }
            i10 = this.I$0;
            volume = this.F$0;
            try {
                a.g(obj);
                i10++;
                h1 h1Var = this.$player;
                if (i10 < 151) {
                    float f10 = i10 / 150;
                    h1Var.setVolume(ae.l.l(((float) Math.exp(f10 * (-3.5d))) * volume, u.P, 1.0f));
                    this.F$0 = volume;
                    this.I$0 = i10;
                    this.F$1 = f10;
                    this.label = 1;
                    if (g0.m(33L, this) == aVar) {
                    }
                    i10++;
                    h1 h1Var2 = this.$player;
                    if (i10 < 151) {
                        h1Var2.pause();
                        this.$player.setVolume(volume);
                        logger = this.this$0.logger;
                        logger.log("SleepTimerFadeOut", "Fade-out complete, player paused");
                        a2 a2Var = a2.f9800a;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$player, volume, null);
                        this.F$0 = volume;
                        this.label = 2;
                    }
                }
            } catch (Throwable th2) {
                a2 a2Var2 = a2.f9800a;
                AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.$player, volume, null);
                this.L$0 = th2;
                this.F$0 = volume;
                this.label = 3;
                if (g0.Q(a2Var2, anonymousClass12, this) != aVar) {
                    throw th2;
                }
            }
            return aVar;
        }
        a.g(obj);
        volume = this.$player.getVolume();
        i10 = 1;
        h1 h1Var22 = this.$player;
        if (i10 < 151) {
        }
        return aVar;
    }
}
