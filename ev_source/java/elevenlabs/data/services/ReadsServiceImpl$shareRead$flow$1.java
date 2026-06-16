package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.api.ReadsUploadAPI;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import sn.z;
import zs.p0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$shareRead$flow$1", f = "ReadsServiceImpl.kt", l = {728, 732, 733}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzs/p0;", "Lokhttp3/ResponseBody;", "<anonymous>", "()Lzs/p0;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ReadsServiceImpl$shareRead$flow$1 extends yn.i implements ho.l {
    final /* synthetic */ String $readId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ReadsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadsServiceImpl$shareRead$flow$1(ReadsServiceImpl readsServiceImpl, String str, wn.c<? super ReadsServiceImpl$shareRead$flow$1> cVar) {
        super(1, cVar);
        this.this$0 = readsServiceImpl;
        this.$readId = str;
    }

    @Override // yn.a
    public final wn.c<z> create(wn.c<?> cVar) {
        return new ReadsServiceImpl$shareRead$flow$1(this.this$0, this.$readId, cVar);
    }

    @Override // ho.l
    public final Object invoke(wn.c<? super p0<ResponseBody>> cVar) {
        return ((ReadsServiceImpl$shareRead$flow$1) create(cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r7 == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
    
        if (r7 == r5) goto L27;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AppCheckTokenService appCheckTokenService;
        String token;
        AnonCaptchaTokenService anonCaptchaTokenService;
        ReadsUploadAPI readsUploadAPI;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        sn.a.g(obj);
                        return obj;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                token = (String) this.L$0;
                sn.a.g(obj);
                readsUploadAPI = this.this$0.readsUploadAPI;
                String str = this.$readId;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                Object shareRead = readsUploadAPI.shareRead(str, token, (String) obj, this);
                if (shareRead == aVar) {
                    return aVar;
                }
                return shareRead;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            appCheckTokenService = this.this$0.appCheckTokenService;
            this.label = 1;
            obj = appCheckTokenService.getAppCheckToken(this);
        }
        AppCheckTokenService.Result result = (AppCheckTokenService.Result) obj;
        if (result instanceof AppCheckTokenService.Result.Error) {
            token = null;
        } else if (result instanceof AppCheckTokenService.Result.Success) {
            token = ((AppCheckTokenService.Result.Success) result).getToken();
        } else {
            c6.p();
            return null;
        }
        anonCaptchaTokenService = this.this$0.anonCaptchaTokenService;
        this.L$0 = token;
        this.label = 2;
        obj = anonCaptchaTokenService.getToken(this);
    }
}
