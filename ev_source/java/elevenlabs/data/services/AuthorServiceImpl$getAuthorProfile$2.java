package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.data.api.AuthorApi;
import io.elevenlabs.data.model.ApiResult;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.AuthorServiceImpl$getAuthorProfile$2", f = "AuthorServiceImpl.kt", l = {37, 41, 43, 42}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lir/j;", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/AuthorProfileResponse;", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class AuthorServiceImpl$getAuthorProfile$2 extends yn.i implements p {
    final /* synthetic */ String $authorId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AuthorServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorServiceImpl$getAuthorProfile$2(AuthorServiceImpl authorServiceImpl, String str, wn.c<? super AuthorServiceImpl$getAuthorProfile$2> cVar) {
        super(2, cVar);
        this.this$0 = authorServiceImpl;
        this.$authorId = str;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        AuthorServiceImpl$getAuthorProfile$2 authorServiceImpl$getAuthorProfile$2 = new AuthorServiceImpl$getAuthorProfile$2(this.this$0, this.$authorId, cVar);
        authorServiceImpl$getAuthorProfile$2.L$0 = obj;
        return authorServiceImpl$getAuthorProfile$2;
    }

    @Override // ho.p
    public final Object invoke(ir.j jVar, wn.c<? super z> cVar) {
        return ((AuthorServiceImpl$getAuthorProfile$2) create(jVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008f, code lost:
    
        if (r0.emit(r9, r8) == r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (r9 != r7) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r0.emit(r9, r8) == r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r9 == r7) goto L27;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AuthorApi authorApi;
        AuthorApi authorApi2;
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
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                } else {
                    sn.a.g(obj);
                    authorApi2 = this.this$0.authorApi;
                    String str = this.$authorId;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = jVar;
                    this.label = 3;
                    obj = authorApi2.getAuthorProfile(str, "no-cache", this);
                }
            } else {
                sn.a.g(obj);
            }
        } else {
            sn.a.g(obj);
            authorApi = this.this$0.authorApi;
            String str2 = this.$authorId;
            this.L$0 = jVar;
            this.label = 1;
            obj = authorApi.getAuthorProfile(str2, "max-stale=3600", this);
        }
        ApiResult apiResult = (ApiResult) obj;
        if (apiResult instanceof ApiResult.Success) {
            this.L$0 = jVar;
            this.L$1 = null;
            this.label = 2;
        }
        authorApi2 = this.this$0.authorApi;
        String str3 = this.$authorId;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = jVar;
        this.label = 3;
        obj = authorApi2.getAuthorProfile(str3, "no-cache", this);
    }
}
