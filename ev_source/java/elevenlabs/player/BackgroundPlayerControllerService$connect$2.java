package io.elevenlabs.player;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import c8.k;
import c8.l;
import com.google.protobuf.c6;
import fr.a2;
import fr.g0;
import ho.p;
import hr.x;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.PlayerConnectionState;
import ir.j;
import ir.j1;
import ja.a0;
import ja.m4;
import ja.w;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import lh.b0;
import sn.z;
import wn.h;
import yn.i;
import z7.j0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerControllerService$connect$2", f = "BackgroundPlayerControllerService.kt", l = {498, 511, 515}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhr/x;", "Lio/elevenlabs/domain/model/PlayerConnectionState;", "Lsn/z;", "<anonymous>", "(Lhr/x;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerControllerService$connect$2 extends i implements p {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ BackgroundPlayerControllerService this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.player.BackgroundPlayerControllerService$connect$2$1", f = "BackgroundPlayerControllerService.kt", l = {507}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.player.BackgroundPlayerControllerService$connect$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ d0 $future;
        Object L$0;
        int label;
        final /* synthetic */ BackgroundPlayerControllerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d0 d0Var, BackgroundPlayerControllerService backgroundPlayerControllerService, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$future = d0Var;
            this.this$0 = backgroundPlayerControllerService;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(this.$future, this.this$0, cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            Context context;
            Context context2;
            Context context3;
            hq.b bVar;
            BackgroundPlayerControllerService backgroundPlayerControllerService;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    backgroundPlayerControllerService = (BackgroundPlayerControllerService) this.L$0;
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                d0 d0Var = this.$future;
                context = this.this$0.context;
                context2 = this.this$0.context;
                context3 = this.this$0.context;
                m4 m4Var = new m4(context2, new ComponentName(context3, (Class<?>) BackgroundPlayerService.class));
                context.getClass();
                Bundle bundle = Bundle.EMPTY;
                lc.f fVar = new lc.f(23);
                Looper y10 = j0.y();
                a0 a0Var = new a0(y10);
                if (m4Var.f19086a.f()) {
                    bVar = new hq.b(new l(new k(context)), 4);
                } else {
                    bVar = null;
                }
                j0.Z(new Handler(y10), new w(a0Var, new ja.z(context, m4Var, bundle, fVar, y10, a0Var, bVar), 0));
                d0Var.f20559a = a0Var;
                backgroundPlayerControllerService = this.this$0;
                b0 b0Var = (b0) this.$future.f20559a;
                this.L$0 = backgroundPlayerControllerService;
                this.label = 1;
                obj = BackgroundPlayerControllerServiceKt.await(b0Var, this);
                xn.a aVar = xn.a.f37986a;
                if (obj == aVar) {
                    return aVar;
                }
            }
            backgroundPlayerControllerService.controller = (ja.z) obj;
            this.this$0.onControllerReady();
            return z.f31622a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerControllerService$connect$2(BackgroundPlayerControllerService backgroundPlayerControllerService, wn.c<? super BackgroundPlayerControllerService$connect$2> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerControllerService;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        BackgroundPlayerControllerService$connect$2 backgroundPlayerControllerService$connect$2 = new BackgroundPlayerControllerService$connect$2(this.this$0, cVar);
        backgroundPlayerControllerService$connect$2.L$0 = obj;
        return backgroundPlayerControllerService$connect$2;
    }

    @Override // ho.p
    public final Object invoke(x xVar, wn.c<? super z> cVar) {
        return ((BackgroundPlayerControllerService$connect$2) create(xVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f3, code lost:
    
        if (fr.g0.Q(r3, r4, r9) == r6) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? obj2;
        Logger logger;
        String str;
        DispatcherFactory dispatcherFactory;
        fr.z main;
        AnonymousClass1 anonymousClass1;
        Throwable th;
        d0 d0Var;
        Logger logger2;
        String str2;
        j1 j1Var;
        Logger logger3;
        String str3;
        b0 b0Var;
        BackgroundPlayerControllerService backgroundPlayerControllerService;
        DispatcherFactory dispatcherFactory2;
        Throwable th2;
        final x xVar = (x) this.L$0;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    backgroundPlayerControllerService = (BackgroundPlayerControllerService) this.L$3;
                    th = (Throwable) this.L$2;
                    sn.a.g(obj);
                    backgroundPlayerControllerService.controller = null;
                    throw th;
                }
                d0Var = (d0) this.L$1;
                try {
                    sn.a.g(obj);
                    throw new RuntimeException();
                } catch (Throwable th3) {
                    th2 = th3;
                    th = th2;
                    logger3 = this.this$0.logger;
                    str3 = this.this$0.tag;
                    logger3.log(str3, "Closing connection");
                    b0Var = (b0) d0Var.f20559a;
                    if (b0Var != null) {
                    }
                }
            } else {
                d0 d0Var2 = (d0) this.L$1;
                try {
                    sn.a.g(obj);
                    obj2 = d0Var2;
                } catch (Throwable th4) {
                    th2 = th4;
                    d0Var = d0Var2;
                    th = th2;
                    logger3 = this.this$0.logger;
                    str3 = this.this$0.tag;
                    logger3.log(str3, "Closing connection");
                    b0Var = (b0) d0Var.f20559a;
                    if (b0Var != null) {
                    }
                }
            }
        } else {
            sn.a.g(obj);
            obj2 = new Object();
            try {
                logger = this.this$0.logger;
                str = this.this$0.tag;
                logger.log(str, "Connecting");
                dispatcherFactory = this.this$0.dispatcherFactory;
                main = dispatcherFactory.getMain();
                anonymousClass1 = new AnonymousClass1(obj2, this.this$0, null);
                this.L$0 = xVar;
                this.L$1 = obj2;
                this.label = 1;
                obj2 = obj2;
            } catch (Throwable th5) {
                th = th5;
                d0Var = obj2;
                logger3 = this.this$0.logger;
                str3 = this.this$0.tag;
                logger3.log(str3, "Closing connection");
                b0Var = (b0) d0Var.f20559a;
                if (b0Var != null) {
                    backgroundPlayerControllerService = this.this$0;
                    dispatcherFactory2 = backgroundPlayerControllerService.dispatcherFactory;
                    h plus = dispatcherFactory2.getMain().plus(a2.f9800a);
                    BackgroundPlayerControllerService$connect$2$3$1 backgroundPlayerControllerService$connect$2$3$1 = new BackgroundPlayerControllerService$connect$2$3$1(backgroundPlayerControllerService, b0Var, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = th;
                    this.L$3 = backgroundPlayerControllerService;
                    this.L$4 = null;
                    this.I$0 = 0;
                    this.label = 3;
                } else {
                    throw th;
                }
            }
            if (g0.Q(main, anonymousClass1, this) == aVar) {
                return aVar;
            }
        }
        logger2 = this.this$0.logger;
        str2 = this.this$0.tag;
        logger2.log(str2, "Connection built");
        j1Var = this.this$0.playerConnectionState;
        j jVar = new j() { // from class: io.elevenlabs.player.BackgroundPlayerControllerService$connect$2.2
            public final Object emit(PlayerConnectionState playerConnectionState, wn.c<? super z> cVar) {
                hr.w wVar = (hr.w) x.this;
                wVar.getClass();
                Object c5 = wVar.f12593d.c(playerConnectionState, cVar);
                if (c5 == xn.a.f37986a) {
                    return c5;
                }
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj3, wn.c cVar) {
                return emit((PlayerConnectionState) obj3, (wn.c<? super z>) cVar);
            }
        };
        this.L$0 = null;
        this.L$1 = obj2;
        this.label = 2;
        if (j1Var.collect(jVar, this) != aVar) {
            d0Var = obj2;
            throw new RuntimeException();
        }
        return aVar;
    }
}
