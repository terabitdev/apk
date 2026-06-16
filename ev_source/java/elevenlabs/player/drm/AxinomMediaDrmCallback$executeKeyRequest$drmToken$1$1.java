package io.elevenlabs.player.drm;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.services.DrmService;
import io.elevenlabs.domain.services.DrmToken;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.player.drm.AxinomMediaDrmCallback$executeKeyRequest$drmToken$1$1", f = "AxinomMediaDrmCallback.kt", l = {60}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lio/elevenlabs/domain/services/DrmToken;", "<anonymous>", "(Lfr/d0;)Lio/elevenlabs/domain/services/DrmToken;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class AxinomMediaDrmCallback$executeKeyRequest$drmToken$1$1 extends i implements p {
    int label;
    final /* synthetic */ AxinomMediaDrmCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AxinomMediaDrmCallback$executeKeyRequest$drmToken$1$1(AxinomMediaDrmCallback axinomMediaDrmCallback, c<? super AxinomMediaDrmCallback$executeKeyRequest$drmToken$1$1> cVar) {
        super(2, cVar);
        this.this$0 = axinomMediaDrmCallback;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new AxinomMediaDrmCallback$executeKeyRequest$drmToken$1$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super DrmToken> cVar) {
        return ((AxinomMediaDrmCallback$executeKeyRequest$drmToken$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        DrmService drmService;
        String str;
        String str2;
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
        drmService = this.this$0.drmService;
        str = this.this$0.readId;
        str2 = this.this$0.fileNumber;
        this.label = 1;
        Object drmToken$default = DrmService.getDrmToken$default(drmService, str, str2, null, this, 4, null);
        xn.a aVar = xn.a.f37986a;
        if (drmToken$default == aVar) {
            return aVar;
        }
        return drmToken$default;
    }
}
