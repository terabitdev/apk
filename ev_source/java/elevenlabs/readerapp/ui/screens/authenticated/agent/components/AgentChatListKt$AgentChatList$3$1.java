package io.elevenlabs.readerapp.ui.screens.authenticated.agent.components;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import ir.c0;
import ir.j;
import ir.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import t1.q;
import t1.z;
import u2.z0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatListKt$AgentChatList$3$1", f = "AgentChatList.kt", l = {85}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AgentChatListKt$AgentChatList$3$1 extends i implements p {
    final /* synthetic */ z0 $followBottom$delegate;
    final /* synthetic */ z $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentChatListKt$AgentChatList$3$1(z zVar, z0 z0Var, wn.c<? super AgentChatListKt$AgentChatList$3$1> cVar) {
        super(2, cVar);
        this.$listState = zVar;
        this.$followBottom$delegate = z0Var;
    }

    public static final int invokeSuspend$lambda$0(z zVar) {
        return ((q) zVar.h()).f31822m - ((q) zVar.h()).f31821l;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new AgentChatListKt$AgentChatList$3$1(this.$listState, this.$followBottom$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((AgentChatListKt$AgentChatList$3$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
            c0 q = r.q(r.o(u2.r.K(new e(this.$listState, 1))), 1);
            AnonymousClass2 anonymousClass2 = new j() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatListKt$AgentChatList$3$1.2
                final /* synthetic */ z0 $followBottom$delegate;

                public AnonymousClass2(z0 z0Var) {
                    r2 = z0Var;
                }

                public final Object emit(int i11, wn.c<? super sn.z> cVar) {
                    boolean AgentChatList$lambda$1;
                    Object scrollToBottom;
                    AgentChatList$lambda$1 = AgentChatListKt.AgentChatList$lambda$1(r2);
                    sn.z zVar = sn.z.f31622a;
                    if (AgentChatList$lambda$1 && (scrollToBottom = AgentChatListKt.scrollToBottom(z.this, cVar)) == xn.a.f37986a) {
                        return scrollToBottom;
                    }
                    return zVar;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                    return emit(((Number) obj2).intValue(), (wn.c<? super sn.z>) cVar);
                }
            };
            this.label = 1;
            Object collect = q.collect(anonymousClass2, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatListKt$AgentChatList$3$1$2 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2<T> implements j {
        final /* synthetic */ z0 $followBottom$delegate;

        public AnonymousClass2(z0 z0Var) {
            r2 = z0Var;
        }

        public final Object emit(int i11, wn.c<? super sn.z> cVar) {
            boolean AgentChatList$lambda$1;
            Object scrollToBottom;
            AgentChatList$lambda$1 = AgentChatListKt.AgentChatList$lambda$1(r2);
            sn.z zVar = sn.z.f31622a;
            if (AgentChatList$lambda$1 && (scrollToBottom = AgentChatListKt.scrollToBottom(z.this, cVar)) == xn.a.f37986a) {
                return scrollToBottom;
            }
            return zVar;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
            return emit(((Number) obj2).intValue(), (wn.c<? super sn.z>) cVar);
        }
    }
}
