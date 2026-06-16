package io.elevenlabs.player;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import ho.q;
import io.elevenlabs.domain.usecase.GetCurrentTimeUseCase;
import io.elevenlabs.player.BackgroundPlayerAction;
import ir.h;
import ir.j;
import ir.r;
import java.util.Date;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import sn.z;
import xq.g;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$observeSleepTimer$2$invokeSuspend$$inlined$flatMapLatest$1", f = "BackgroundPlayerService.kt", l = {189}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {TokenNames.R, TokenNames.T, "Lir/j;", "it", "Lsn/z;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$observeSleepTimer$2$invokeSuspend$$inlined$flatMapLatest$1 extends i implements q {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$observeSleepTimer$2$invokeSuspend$$inlined$flatMapLatest$1(wn.c cVar, BackgroundPlayerService backgroundPlayerService) {
        super(3, cVar);
        this.this$0 = backgroundPlayerService;
    }

    public final Object invoke(j jVar, BackgroundPlayerAction.SleepTimer sleepTimer, wn.c<? super z> cVar) {
        BackgroundPlayerService$observeSleepTimer$2$invokeSuspend$$inlined$flatMapLatest$1 backgroundPlayerService$observeSleepTimer$2$invokeSuspend$$inlined$flatMapLatest$1 = new BackgroundPlayerService$observeSleepTimer$2$invokeSuspend$$inlined$flatMapLatest$1(cVar, this.this$0);
        backgroundPlayerService$observeSleepTimer$2$invokeSuspend$$inlined$flatMapLatest$1.L$0 = jVar;
        backgroundPlayerService$observeSleepTimer$2$invokeSuspend$$inlined$flatMapLatest$1.L$1 = sleepTimer;
        return backgroundPlayerService$observeSleepTimer$2$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ir.i iVar;
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
            j jVar = (j) this.L$0;
            final BackgroundPlayerAction.SleepTimer sleepTimer = (BackgroundPlayerAction.SleepTimer) this.L$1;
            if (sleepTimer.getDate() == null) {
                iVar = h.f17943a;
            } else {
                GetCurrentTimeUseCase getCurrentTimeUseCase = this.this$0.getGetCurrentTimeUseCase();
                xq.a aVar = xq.b.f38124b;
                final ir.i mo959invokeLRDsOJo = getCurrentTimeUseCase.mo959invokeLRDsOJo(g.n(1, xq.d.SECONDS));
                iVar = new ir.i() { // from class: io.elevenlabs.player.BackgroundPlayerService$observeSleepTimer$2$invokeSuspend$lambda$0$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.player.BackgroundPlayerService$observeSleepTimer$2$invokeSuspend$lambda$0$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes3.dex */
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ BackgroundPlayerAction.SleepTimer $action$inlined;
                        final /* synthetic */ j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$observeSleepTimer$2$invokeSuspend$lambda$0$$inlined$map$1$2", f = "BackgroundPlayerService.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.player.BackgroundPlayerService$observeSleepTimer$2$invokeSuspend$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
                        /* loaded from: classes3.dex */
                        public static final class AnonymousClass1 extends yn.c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(wn.c cVar) {
                                super(cVar);
                            }

                            @Override // yn.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(j jVar, BackgroundPlayerAction.SleepTimer sleepTimer) {
                            this.$this_unsafeFlow = jVar;
                            this.$action$inlined = sleepTimer;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                        @Override // ir.j
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, wn.c cVar) {
                            AnonymousClass1 anonymousClass1;
                            int i10;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    i10 = anonymousClass1.label;
                                    if (i10 == 0) {
                                        if (i10 == 1) {
                                            sn.a.g(obj2);
                                        } else {
                                            c6.x("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                    } else {
                                        sn.a.g(obj2);
                                        j jVar = this.$this_unsafeFlow;
                                        k kVar = new k((Date) obj, this.$action$inlined.getDate());
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        Object emit = jVar.emit(kVar, anonymousClass1);
                                        xn.a aVar = xn.a.f37986a;
                                        if (emit == aVar) {
                                            return aVar;
                                        }
                                    }
                                    return z.f31622a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(cVar);
                            Object obj22 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                            }
                            return z.f31622a;
                        }
                    }

                    @Override // ir.i
                    public Object collect(j jVar2, wn.c cVar) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar2, sleepTimer), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return z.f31622a;
                    }
                };
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            Object r10 = r.r(jVar, iVar, this);
            xn.a aVar2 = xn.a.f37986a;
            if (r10 == aVar2) {
                return aVar2;
            }
        }
        return z.f31622a;
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((j) obj, (BackgroundPlayerAction.SleepTimer) obj2, (wn.c<? super z>) obj3);
    }
}
