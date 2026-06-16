package io.elevenlabs.readerapp.ui.screens.authenticated.agent.components;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import ir.c0;
import ir.j;
import ir.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import t1.z;
import u2.z0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatListKt$AgentChatList$1$1", f = "AgentChatList.kt", l = {66}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AgentChatListKt$AgentChatList$1$1 extends i implements p {
    final /* synthetic */ z0 $followBottom$delegate;
    final /* synthetic */ z $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentChatListKt$AgentChatList$1$1(z zVar, z0 z0Var, wn.c<? super AgentChatListKt$AgentChatList$1$1> cVar) {
        super(2, cVar);
        this.$listState = zVar;
        this.$followBottom$delegate = z0Var;
    }

    public static final boolean invokeSuspend$lambda$0(z zVar) {
        return zVar.f31880i.b();
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new AgentChatListKt$AgentChatList$1$1(this.$listState, this.$followBottom$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((AgentChatListKt$AgentChatList$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
            final c0 q = r.q(u2.r.K(new e(this.$listState, 0)), 1);
            ir.i iVar = new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatListKt$AgentChatList$1$1$invokeSuspend$$inlined$filter$1

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatListKt$AgentChatList$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements j {
                    final /* synthetic */ j $this_unsafeFlow;

                    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatListKt$AgentChatList$1$1$invokeSuspend$$inlined$filter$1$2", f = "AgentChatList.kt", l = {50}, m = "emit", v = 2)
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatListKt$AgentChatList$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    /* loaded from: classes4.dex */
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

                    public AnonymousClass2(j jVar) {
                        this.$this_unsafeFlow = jVar;
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
                                    if (!((Boolean) obj).booleanValue()) {
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        Object emit = jVar.emit(obj, anonymousClass1);
                                        xn.a aVar = xn.a.f37986a;
                                        if (emit == aVar) {
                                            return aVar;
                                        }
                                    }
                                }
                                return sn.z.f31622a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(cVar);
                        Object obj22 = anonymousClass1.result;
                        i10 = anonymousClass1.label;
                        if (i10 == 0) {
                        }
                        return sn.z.f31622a;
                    }
                }

                @Override // ir.i
                public Object collect(j jVar, wn.c cVar) {
                    Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                    if (collect == xn.a.f37986a) {
                        return collect;
                    }
                    return sn.z.f31622a;
                }
            };
            AnonymousClass3 anonymousClass3 = new j() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatListKt$AgentChatList$1$1.3
                final /* synthetic */ z0 $followBottom$delegate;

                public AnonymousClass3(z0 z0Var) {
                    r2 = z0Var;
                }

                public final Object emit(boolean z6, wn.c<? super sn.z> cVar) {
                    boolean isAtBottomNow;
                    z0 z0Var = r2;
                    isAtBottomNow = AgentChatListKt.isAtBottomNow(z.this);
                    AgentChatListKt.AgentChatList$lambda$2(z0Var, isAtBottomNow);
                    return sn.z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                    return emit(((Boolean) obj2).booleanValue(), (wn.c<? super sn.z>) cVar);
                }
            };
            this.label = 1;
            Object collect = iVar.collect(anonymousClass3, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatListKt$AgentChatList$1$1$3 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3<T> implements j {
        final /* synthetic */ z0 $followBottom$delegate;

        public AnonymousClass3(z0 z0Var) {
            r2 = z0Var;
        }

        public final Object emit(boolean z6, wn.c<? super sn.z> cVar) {
            boolean isAtBottomNow;
            z0 z0Var = r2;
            isAtBottomNow = AgentChatListKt.isAtBottomNow(z.this);
            AgentChatListKt.AgentChatList$lambda$2(z0Var, isAtBottomNow);
            return sn.z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
            return emit(((Boolean) obj2).booleanValue(), (wn.c<? super sn.z>) cVar);
        }
    }
}
