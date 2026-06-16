package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.data.api.CollectionsAPI;
import io.elevenlabs.data.model.ApiResult;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.CollectionsServiceImpl$observeCollectionData$2", f = "CollectionsServiceImpl.kt", l = {144, 148, 150, 149}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lir/j;", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/GetCollectionResponse;", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class CollectionsServiceImpl$observeCollectionData$2 extends yn.i implements p {
    final /* synthetic */ String $collectionId;
    final /* synthetic */ String $cursor;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CollectionsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsServiceImpl$observeCollectionData$2(CollectionsServiceImpl collectionsServiceImpl, String str, String str2, wn.c<? super CollectionsServiceImpl$observeCollectionData$2> cVar) {
        super(2, cVar);
        this.this$0 = collectionsServiceImpl;
        this.$collectionId = str;
        this.$cursor = str2;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        CollectionsServiceImpl$observeCollectionData$2 collectionsServiceImpl$observeCollectionData$2 = new CollectionsServiceImpl$observeCollectionData$2(this.this$0, this.$collectionId, this.$cursor, cVar);
        collectionsServiceImpl$observeCollectionData$2.L$0 = obj;
        return collectionsServiceImpl$observeCollectionData$2;
    }

    @Override // ho.p
    public final Object invoke(ir.j jVar, wn.c<? super z> cVar) {
        return ((CollectionsServiceImpl$observeCollectionData$2) create(jVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a0, code lost:
    
        if (r8.emit(r0, r14) == r13) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a2, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
    
        if (r0 != r13) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r8.emit(r0, r14) == r13) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r0 == r13) goto L27;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CollectionsAPI collectionsAPI;
        Object byId$default;
        CollectionsAPI collectionsAPI2;
        Object byId$default2;
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
                    byId$default2 = obj;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                } else {
                    sn.a.g(obj);
                    collectionsAPI2 = this.this$0.collectionsAPI;
                    String str = this.$collectionId;
                    String str2 = this.$cursor;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = jVar;
                    this.label = 3;
                    byId$default2 = CollectionsAPI.getById$default(collectionsAPI2, str, "private", 0, str2, this, 4, null);
                }
            } else {
                sn.a.g(obj);
                byId$default = obj;
            }
        } else {
            sn.a.g(obj);
            collectionsAPI = this.this$0.collectionsAPI;
            String str3 = this.$collectionId;
            String str4 = this.$cursor;
            this.L$0 = jVar;
            this.label = 1;
            byId$default = CollectionsAPI.getById$default(collectionsAPI, str3, "max-stale=3600", 0, str4, this, 4, null);
        }
        ApiResult apiResult = (ApiResult) byId$default;
        if (apiResult instanceof ApiResult.Success) {
            this.L$0 = jVar;
            this.L$1 = null;
            this.label = 2;
        }
        collectionsAPI2 = this.this$0.collectionsAPI;
        String str5 = this.$collectionId;
        String str22 = this.$cursor;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = jVar;
        this.label = 3;
        byId$default2 = CollectionsAPI.getById$default(collectionsAPI2, str5, "private", 0, str22, this, 4, null);
    }
}
