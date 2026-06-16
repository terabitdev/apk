package io.elevenlabs.data.services;

import android.gov.nist.core.Separators;
import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.data.api.ReadsAPI;
import io.elevenlabs.data.model.ApiResult;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import sn.z;
import tn.a0;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.ReadsExploreServiceImpl$getExploreIndex$2", f = "ReadsExploreServiceImpl.kt", l = {174, 182, 185, 184}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lir/j;", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel;", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ReadsExploreServiceImpl$getExploreIndex$2 extends yn.i implements p {
    final /* synthetic */ String $currency;
    final /* synthetic */ String $cursor;
    final /* synthetic */ Map<String, List<String>> $filters;
    final /* synthetic */ String $language;
    final /* synthetic */ String $sortBy;
    final /* synthetic */ boolean $useCache;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ReadsExploreServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReadsExploreServiceImpl$getExploreIndex$2(Map<String, ? extends List<String>> map, boolean z6, ReadsExploreServiceImpl readsExploreServiceImpl, String str, String str2, String str3, String str4, wn.c<? super ReadsExploreServiceImpl$getExploreIndex$2> cVar) {
        super(2, cVar);
        this.$filters = map;
        this.$useCache = z6;
        this.this$0 = readsExploreServiceImpl;
        this.$language = str;
        this.$currency = str2;
        this.$cursor = str3;
        this.$sortBy = str4;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        ReadsExploreServiceImpl$getExploreIndex$2 readsExploreServiceImpl$getExploreIndex$2 = new ReadsExploreServiceImpl$getExploreIndex$2(this.$filters, this.$useCache, this.this$0, this.$language, this.$currency, this.$cursor, this.$sortBy, cVar);
        readsExploreServiceImpl$getExploreIndex$2.L$0 = obj;
        return readsExploreServiceImpl$getExploreIndex$2;
    }

    @Override // ho.p
    public final Object invoke(ir.j jVar, wn.c<? super z> cVar) {
        return ((ReadsExploreServiceImpl$getExploreIndex$2) create(jVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00fa, code lost:
    
        if (r8.emit(r0, r20) == r13) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00eb, code lost:
    
        if (r0 == r13) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b5, code lost:
    
        if (r0 == r13) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.Map] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        ReadsAPI readsAPI;
        Object exploreIndex;
        LinkedHashMap linkedHashMap2;
        ReadsAPI readsAPI2;
        Object exploreIndex2;
        ir.j jVar = (ir.j) this.L$0;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            sn.a.g(obj);
                            return z.f31622a;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jVar = (ir.j) this.L$2;
                    sn.a.g(obj);
                    exploreIndex2 = obj;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                } else {
                    ?? r02 = (Map) this.L$1;
                    sn.a.g(obj);
                    linkedHashMap2 = r02;
                    linkedHashMap = linkedHashMap2;
                    readsAPI2 = this.this$0.readsAPI;
                    String str = this.$language;
                    String str2 = this.$currency;
                    String str3 = this.$cursor;
                    String str4 = this.$sortBy;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = jVar;
                    this.label = 3;
                    exploreIndex2 = readsAPI2.getExploreIndex("private", str, str2, str3, str4, linkedHashMap, this);
                }
            } else {
                ?? r03 = (Map) this.L$1;
                sn.a.g(obj);
                linkedHashMap = r03;
                exploreIndex = obj;
            }
        } else {
            sn.a.g(obj);
            Map<String, List<String>> map = this.$filters;
            linkedHashMap = new LinkedHashMap(a0.H(map.size()));
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), o.E0((Iterable) entry.getValue(), Separators.SEMICOLON, null, null, null, 62));
            }
            if (this.$useCache) {
                readsAPI = this.this$0.readsAPI;
                String str5 = this.$language;
                String str6 = this.$currency;
                String str7 = this.$cursor;
                String str8 = this.$sortBy;
                this.L$0 = jVar;
                this.L$1 = linkedHashMap;
                this.label = 1;
                exploreIndex = readsAPI.getExploreIndex("max-stale=3600", str5, str6, str7, str8, linkedHashMap, this);
            }
            readsAPI2 = this.this$0.readsAPI;
            String str9 = this.$language;
            String str22 = this.$currency;
            String str32 = this.$cursor;
            String str42 = this.$sortBy;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = jVar;
            this.label = 3;
            exploreIndex2 = readsAPI2.getExploreIndex("private", str9, str22, str32, str42, linkedHashMap, this);
        }
        ApiResult apiResult = (ApiResult) exploreIndex;
        if (apiResult instanceof ApiResult.Success) {
            this.L$0 = jVar;
            this.L$1 = linkedHashMap;
            this.L$2 = null;
            this.label = 2;
            if (jVar.emit(apiResult, this) != aVar) {
                linkedHashMap2 = linkedHashMap;
                linkedHashMap = linkedHashMap2;
            }
            return aVar;
        }
        readsAPI2 = this.this$0.readsAPI;
        String str92 = this.$language;
        String str222 = this.$currency;
        String str322 = this.$cursor;
        String str422 = this.$sortBy;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = jVar;
        this.label = 3;
        exploreIndex2 = readsAPI2.getExploreIndex("private", str92, str222, str322, str422, linkedHashMap, this);
    }
}
