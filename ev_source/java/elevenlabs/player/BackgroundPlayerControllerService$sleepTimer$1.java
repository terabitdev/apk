package io.elevenlabs.player;

import android.os.Bundle;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.p;
import hr.w;
import hr.x;
import io.elevenlabs.domain.DispatcherFactory;
import java.util.Date;
import kotlin.Metadata;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerControllerService$sleepTimer$1", f = "BackgroundPlayerControllerService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhr/x;", "Ljava/util/Date;", "Lsn/z;", "<anonymous>", "(Lhr/x;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerControllerService$sleepTimer$1 extends i implements p {
    final /* synthetic */ long $interval;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BackgroundPlayerControllerService this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.player.BackgroundPlayerControllerService$sleepTimer$1$1", f = "BackgroundPlayerControllerService.kt", l = {342, 350}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.player.BackgroundPlayerControllerService$sleepTimer$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ x $$this$channelFlow;
        final /* synthetic */ long $interval;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BackgroundPlayerControllerService this$0;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.player.BackgroundPlayerControllerService$sleepTimer$1$1$1", f = "BackgroundPlayerControllerService.kt", l = {345, 347}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.player.BackgroundPlayerControllerService$sleepTimer$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C00181 extends i implements p {
            final /* synthetic */ x $$this$channelFlow;
            Object L$0;
            int label;
            final /* synthetic */ BackgroundPlayerControllerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00181(BackgroundPlayerControllerService backgroundPlayerControllerService, x xVar, wn.c<? super C00181> cVar) {
                super(2, cVar);
                this.this$0 = backgroundPlayerControllerService;
                this.$$this$channelFlow = xVar;
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                return new C00181(this.this$0, this.$$this$channelFlow, cVar);
            }

            @Override // ho.p
            public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
                return ((C00181) create(d0Var, cVar)).invokeSuspend(z.f31622a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
            
                if (r3.f12593d.c(r1, r7) == r4) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
            
                return r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
            
                if (r3.f12593d.c(null, r7) == r4) goto L23;
             */
            @Override // yn.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                ja.z zVar;
                Long l4;
                Bundle a10;
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1 && i10 != 2) {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    zVar = this.this$0.controller;
                    if (zVar != null && (a10 = zVar.a()) != null) {
                        l4 = ExchangeKt.getSleepTimerTimestamp(a10);
                    } else {
                        l4 = null;
                    }
                    x xVar = this.$$this$channelFlow;
                    xn.a aVar = xn.a.f37986a;
                    if (l4 != null) {
                        w wVar = (w) xVar;
                        wVar.getClass();
                        Date date = new Date(l4.longValue());
                        this.L$0 = null;
                        this.label = 1;
                    } else {
                        w wVar2 = (w) xVar;
                        wVar2.getClass();
                        this.L$0 = null;
                        this.label = 2;
                    }
                }
                return z.f31622a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BackgroundPlayerControllerService backgroundPlayerControllerService, long j4, x xVar, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = backgroundPlayerControllerService;
            this.$interval = j4;
            this.$$this$channelFlow = xVar;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$interval, this.$$this$channelFlow, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
        
            if (fr.g0.n(r5, r8) == r4) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (fr.g0.Q(r9, r1, r8) == r4) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        
            return r4;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x004e -> B:11:0x001f). Please report as a decompilation issue!!! */
        @Override // yn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            DispatcherFactory dispatcherFactory;
            d0 d0Var = (d0) this.L$0;
            int i10 = this.label;
            xn.a aVar = xn.a.f37986a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    long j4 = this.$interval;
                    this.L$0 = d0Var;
                    this.label = 2;
                }
            }
            sn.a.g(obj);
            if (g0.y(d0Var)) {
                dispatcherFactory = this.this$0.dispatcherFactory;
                fr.z main = dispatcherFactory.getMain();
                C00181 c00181 = new C00181(this.this$0, this.$$this$channelFlow, null);
                this.L$0 = d0Var;
                this.label = 1;
            } else {
                return z.f31622a;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerControllerService$sleepTimer$1(BackgroundPlayerControllerService backgroundPlayerControllerService, long j4, wn.c<? super BackgroundPlayerControllerService$sleepTimer$1> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerControllerService;
        this.$interval = j4;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        BackgroundPlayerControllerService$sleepTimer$1 backgroundPlayerControllerService$sleepTimer$1 = new BackgroundPlayerControllerService$sleepTimer$1(this.this$0, this.$interval, cVar);
        backgroundPlayerControllerService$sleepTimer$1.L$0 = obj;
        return backgroundPlayerControllerService$sleepTimer$1;
    }

    @Override // ho.p
    public final Object invoke(x xVar, wn.c<? super z> cVar) {
        return ((BackgroundPlayerControllerService$sleepTimer$1) create(xVar, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        DispatcherFactory dispatcherFactory;
        x xVar = (x) this.L$0;
        if (this.label == 0) {
            sn.a.g(obj);
            dispatcherFactory = this.this$0.dispatcherFactory;
            g0.D(xVar, dispatcherFactory.getDefault(), null, new AnonymousClass1(this.this$0, this.$interval, xVar, null), 2);
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
