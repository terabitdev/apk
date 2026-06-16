package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.api.ReadsUploadAPI;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import sn.z;
import zs.p0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$getReadHtml$3", f = "ReadsServiceImpl.kt", l = {458}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzs/p0;", "Lokhttp3/ResponseBody;", "<anonymous>", "()Lzs/p0;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ReadsServiceImpl$getReadHtml$3 extends yn.i implements ho.l {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ ReadsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadsServiceImpl$getReadHtml$3(ReadsServiceImpl readsServiceImpl, String str, wn.c<? super ReadsServiceImpl$getReadHtml$3> cVar) {
        super(1, cVar);
        this.this$0 = readsServiceImpl;
        this.$id = str;
    }

    @Override // yn.a
    public final wn.c<z> create(wn.c<?> cVar) {
        return new ReadsServiceImpl$getReadHtml$3(this.this$0, this.$id, cVar);
    }

    @Override // ho.l
    public final Object invoke(wn.c<? super p0<ResponseBody>> cVar) {
        return ((ReadsServiceImpl$getReadHtml$3) create(cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ReadsUploadAPI readsUploadAPI;
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
        readsUploadAPI = this.this$0.readsUploadAPI;
        String str = this.$id;
        this.label = 1;
        Object readHtml = readsUploadAPI.getReadHtml(str, this);
        xn.a aVar = xn.a.f37986a;
        if (readHtml == aVar) {
            return aVar;
        }
        return readHtml;
    }
}
