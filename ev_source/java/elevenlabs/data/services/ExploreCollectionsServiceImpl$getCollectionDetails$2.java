package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.data.api.ExploreCollectionsAPI;
import io.elevenlabs.data.model.ApiResult;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.ExploreCollectionsServiceImpl$getCollectionDetails$2", f = "ExploreCollectionsServiceImpl.kt", l = {37, 42, 44, 43}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lir/j;", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/ExploreCollectionDetailsV4Response;", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ExploreCollectionsServiceImpl$getCollectionDetails$2 extends yn.i implements p {
    final /* synthetic */ String $collectionId;
    final /* synthetic */ String $language;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ExploreCollectionsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreCollectionsServiceImpl$getCollectionDetails$2(ExploreCollectionsServiceImpl exploreCollectionsServiceImpl, String str, String str2, wn.c<? super ExploreCollectionsServiceImpl$getCollectionDetails$2> cVar) {
        super(2, cVar);
        this.this$0 = exploreCollectionsServiceImpl;
        this.$collectionId = str;
        this.$language = str2;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        ExploreCollectionsServiceImpl$getCollectionDetails$2 exploreCollectionsServiceImpl$getCollectionDetails$2 = new ExploreCollectionsServiceImpl$getCollectionDetails$2(this.this$0, this.$collectionId, this.$language, cVar);
        exploreCollectionsServiceImpl$getCollectionDetails$2.L$0 = obj;
        return exploreCollectionsServiceImpl$getCollectionDetails$2;
    }

    @Override // ho.p
    public final Object invoke(ir.j jVar, wn.c<? super z> cVar) {
        return ((ExploreCollectionsServiceImpl$getCollectionDetails$2) create(jVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a6, code lost:
    
        if (r9.emit(r0, r15) == r14) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a8, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
    
        if (r0 != r14) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r9.emit(r0, r15) == r14) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r0 == r14) goto L27;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ExploreCollectionsAPI exploreCollectionsAPI;
        Object collectionDetails$default;
        ExploreCollectionsAPI exploreCollectionsAPI2;
        Object collectionDetails$default2;
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
                    collectionDetails$default2 = obj;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                } else {
                    sn.a.g(obj);
                    exploreCollectionsAPI2 = this.this$0.exploreCollectionsAPI;
                    String str = this.$collectionId;
                    String str2 = this.$language;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = jVar;
                    this.label = 3;
                    collectionDetails$default2 = ExploreCollectionsAPI.getCollectionDetails$default(exploreCollectionsAPI2, str, "private", null, null, str2, this, 12, null);
                }
            } else {
                sn.a.g(obj);
                collectionDetails$default = obj;
            }
        } else {
            sn.a.g(obj);
            exploreCollectionsAPI = this.this$0.exploreCollectionsAPI;
            String str3 = this.$collectionId;
            String str4 = this.$language;
            this.L$0 = jVar;
            this.label = 1;
            collectionDetails$default = ExploreCollectionsAPI.getCollectionDetails$default(exploreCollectionsAPI, str3, "max-stale=3600", null, null, str4, this, 12, null);
        }
        ApiResult apiResult = (ApiResult) collectionDetails$default;
        if (apiResult instanceof ApiResult.Success) {
            this.L$0 = jVar;
            this.L$1 = null;
            this.label = 2;
        }
        exploreCollectionsAPI2 = this.this$0.exploreCollectionsAPI;
        String str5 = this.$collectionId;
        String str22 = this.$language;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = jVar;
        this.label = 3;
        collectionDetails$default2 = ExploreCollectionsAPI.getCollectionDetails$default(exploreCollectionsAPI2, str5, "private", null, null, str22, this, 12, null);
    }
}
