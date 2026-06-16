package io.elevenlabs.readerapp.services;

import com.google.api.Endpoint;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import fr.j0;
import ho.p;
import io.elevenlabs.domain.model.ReadMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import sn.z;
import tn.t;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.services.AgentContextServiceImpl$buildUltraReadsContext$ultraTitles$1", f = "AgentContextServiceImpl.kt", l = {Endpoint.TARGET_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "", "", "<anonymous>", "(Lfr/d0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class AgentContextServiceImpl$buildUltraReadsContext$ultraTitles$1 extends i implements p {
    final /* synthetic */ List<ReadMeta> $recent;
    int label;
    final /* synthetic */ AgentContextServiceImpl this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.elevenlabs.readerapp.services.AgentContextServiceImpl$buildUltraReadsContext$ultraTitles$1$1", f = "AgentContextServiceImpl.kt", l = {104}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "", "", "<anonymous>", "(Lfr/d0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.services.AgentContextServiceImpl$buildUltraReadsContext$ultraTitles$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ List<ReadMeta> $recent;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AgentContextServiceImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<ReadMeta> list, AgentContextServiceImpl agentContextServiceImpl, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$recent = list;
            this.this$0 = agentContextServiceImpl;
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$recent, this.this$0, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, c<? super List<String>> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            String str;
            d0 d0Var = (d0) this.L$0;
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
                List<ReadMeta> list = this.$recent;
                AgentContextServiceImpl agentContextServiceImpl = this.this$0;
                ArrayList arrayList = new ArrayList(tn.p.a0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(g0.g(d0Var, null, new AgentContextServiceImpl$buildUltraReadsContext$ultraTitles$1$1$1$1((ReadMeta) it.next(), agentContextServiceImpl, null), 3));
                }
                this.L$0 = null;
                this.label = 1;
                if (arrayList.isEmpty()) {
                    obj = t.f33547a;
                } else {
                    obj = new fr.e((j0[]) arrayList.toArray(new j0[0])).a(this);
                }
                xn.a aVar = xn.a.f37986a;
                if (obj == aVar) {
                    return aVar;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (ReadMeta readMeta : (Iterable) obj) {
                if (readMeta != null) {
                    str = readMeta.getTitle();
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentContextServiceImpl$buildUltraReadsContext$ultraTitles$1(List<ReadMeta> list, AgentContextServiceImpl agentContextServiceImpl, c<? super AgentContextServiceImpl$buildUltraReadsContext$ultraTitles$1> cVar) {
        super(2, cVar);
        this.$recent = list;
        this.this$0 = agentContextServiceImpl;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new AgentContextServiceImpl$buildUltraReadsContext$ultraTitles$1(this.$recent, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super List<String>> cVar) {
        return ((AgentContextServiceImpl$buildUltraReadsContext$ultraTitles$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
                return obj;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sn.a.g(obj);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$recent, this.this$0, null);
        this.label = 1;
        Object l4 = g0.l(anonymousClass1, this);
        xn.a aVar = xn.a.f37986a;
        if (l4 == aVar) {
            return aVar;
        }
        return l4;
    }
}
