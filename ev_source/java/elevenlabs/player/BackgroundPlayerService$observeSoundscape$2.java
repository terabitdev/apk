package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.player.audio.LoopingAudioPlayer;
import io.elevenlabs.player.audio.SleepTimerFadeOut;
import ir.j1;
import ir.r;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$observeSoundscape$2", f = "BackgroundPlayerService.kt", l = {447}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$observeSoundscape$2 extends i implements p {
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$observeSoundscape$2(BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$observeSoundscape$2> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerService$observeSoundscape$2(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$observeSoundscape$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            j1 j1Var = this.this$0.isPlaying;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            Object l4 = r.l(j1Var, anonymousClass1, this);
            xn.a aVar = xn.a.f37986a;
            if (l4 == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$observeSoundscape$2$1", f = "BackgroundPlayerService.kt", l = {450, 452}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "playing", "Lsn/z;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.player.BackgroundPlayerService$observeSoundscape$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements p {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ BackgroundPlayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BackgroundPlayerService backgroundPlayerService, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = backgroundPlayerService;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public final Object invoke(boolean z6, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z6), cVar)).invokeSuspend(z.f31622a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        
            if (r5.resume(r4) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        
            if (r5.pause(r4) == r1) goto L21;
         */
        @Override // yn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SleepTimerFadeOut sleepTimerFadeOut;
            boolean z6 = this.Z$0;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
            } else {
                sn.a.g(obj);
                BackgroundPlayerService backgroundPlayerService = this.this$0;
                xn.a aVar = xn.a.f37986a;
                if (z6) {
                    sleepTimerFadeOut = backgroundPlayerService.sleepTimerFadeOut;
                    if (sleepTimerFadeOut != null) {
                        sleepTimerFadeOut.cancel();
                        LoopingAudioPlayer loopingAudioPlayer = this.this$0.getLoopingAudioPlayer();
                        this.Z$0 = z6;
                        this.label = 1;
                    } else {
                        m.i("sleepTimerFadeOut");
                        throw null;
                    }
                } else {
                    LoopingAudioPlayer loopingAudioPlayer2 = backgroundPlayerService.getLoopingAudioPlayer();
                    this.Z$0 = z6;
                    this.label = 2;
                }
            }
            return z.f31622a;
        }

        @Override // ho.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (wn.c<? super z>) obj2);
        }
    }
}
