package io.elevenlabs.player.media;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.services.MediaManifestService;
import kotlin.Metadata;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.player.media.HlsMediaDataSource$fetchManifestUrlWithRetry$1$1$1", f = "HlsMediaDataSource.kt", l = {131}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "", "<anonymous>", "(Lfr/d0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class HlsMediaDataSource$fetchManifestUrlWithRetry$1$1$1 extends i implements p {
    final /* synthetic */ String $fileNumber;
    final /* synthetic */ String $readId;
    int label;
    final /* synthetic */ HlsMediaDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HlsMediaDataSource$fetchManifestUrlWithRetry$1$1$1(HlsMediaDataSource hlsMediaDataSource, String str, String str2, c<? super HlsMediaDataSource$fetchManifestUrlWithRetry$1$1$1> cVar) {
        super(2, cVar);
        this.this$0 = hlsMediaDataSource;
        this.$readId = str;
        this.$fileNumber = str2;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new HlsMediaDataSource$fetchManifestUrlWithRetry$1$1$1(this.this$0, this.$readId, this.$fileNumber, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super String> cVar) {
        return ((HlsMediaDataSource$fetchManifestUrlWithRetry$1$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        MediaManifestService mediaManifestService;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                a.g(obj);
                return obj;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        a.g(obj);
        mediaManifestService = this.this$0.mediaManifestService;
        String str = this.$readId;
        String str2 = this.$fileNumber;
        this.label = 1;
        Object hlsManifestUrl = mediaManifestService.getHlsManifestUrl(str, str2, this);
        xn.a aVar = xn.a.f37986a;
        if (hlsManifestUrl == aVar) {
            return aVar;
        }
        return hlsManifestUrl;
    }
}
