package io.elevenlabs.data.services;

import android.gov.nist.core.Separators;
import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.data.api.ReadsAPI;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import sn.z;
import tn.a0;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreFilter$2", f = "ReadsExploreServiceImpl.kt", l = {208, 207}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lir/j;", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel;", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ReadsExploreServiceImpl$getExploreFilter$2 extends yn.i implements p {
    final /* synthetic */ String $currency;
    final /* synthetic */ String $cursor;
    final /* synthetic */ Map<String, List<String>> $filters;
    final /* synthetic */ String $language;
    final /* synthetic */ String $sortBy;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ReadsExploreServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReadsExploreServiceImpl$getExploreFilter$2(Map<String, ? extends List<String>> map, ReadsExploreServiceImpl readsExploreServiceImpl, String str, String str2, String str3, String str4, wn.c<? super ReadsExploreServiceImpl$getExploreFilter$2> cVar) {
        super(2, cVar);
        this.$filters = map;
        this.this$0 = readsExploreServiceImpl;
        this.$language = str;
        this.$currency = str2;
        this.$cursor = str3;
        this.$sortBy = str4;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        ReadsExploreServiceImpl$getExploreFilter$2 readsExploreServiceImpl$getExploreFilter$2 = new ReadsExploreServiceImpl$getExploreFilter$2(this.$filters, this.this$0, this.$language, this.$currency, this.$cursor, this.$sortBy, cVar);
        readsExploreServiceImpl$getExploreFilter$2.L$0 = obj;
        return readsExploreServiceImpl$getExploreFilter$2;
    }

    @Override // ho.p
    public final Object invoke(ir.j jVar, wn.c<? super z> cVar) {
        return ((ReadsExploreServiceImpl$getExploreFilter$2) create(jVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a2, code lost:
    
        if (r7.emit(r0, r17) == r10) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a4, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        if (r0 == r10) goto L19;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReadsAPI readsAPI;
        Object exploreFilter;
        ir.j jVar = (ir.j) this.L$0;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jVar = (ir.j) this.L$2;
            sn.a.g(obj);
            exploreFilter = obj;
        } else {
            sn.a.g(obj);
            Map<String, List<String>> map = this.$filters;
            LinkedHashMap linkedHashMap = new LinkedHashMap(a0.H(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), o.E0((Iterable) entry.getValue(), Separators.SEMICOLON, null, null, null, 62));
            }
            readsAPI = this.this$0.readsAPI;
            String str = this.$language;
            String str2 = this.$currency;
            String str3 = this.$cursor;
            String str4 = this.$sortBy;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = jVar;
            this.label = 1;
            exploreFilter = readsAPI.getExploreFilter(str, str2, str3, str4, linkedHashMap, this);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}
