package io.elevenlabs.readerapp.ui.components.explore;

import android.content.Context;
import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.ui.extensions.CoilExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.components.explore.ExploreCarouselDefaultsKt$PreloadCarouselImages$1$1", f = "ExploreCarouselDefaults.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ExploreCarouselDefaultsKt$PreloadCarouselImages$1$1 extends yn.i implements ho.p {
    final /* synthetic */ Context $context;
    final /* synthetic */ List<String> $urls;
    final /* synthetic */ boolean $useCoverCacheKey;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreCarouselDefaultsKt$PreloadCarouselImages$1$1(Context context, List<String> list, boolean z6, wn.c<? super ExploreCarouselDefaultsKt$PreloadCarouselImages$1$1> cVar) {
        super(2, cVar);
        this.$context = context;
        this.$urls = list;
        this.$useCoverCacheKey = z6;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new ExploreCarouselDefaultsKt$PreloadCarouselImages$1$1(this.$context, this.$urls, this.$useCoverCacheKey, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((ExploreCarouselDefaultsKt$PreloadCarouselImages$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ad.i a10;
        if (this.label == 0) {
            sn.a.g(obj);
            pc.f a11 = pc.a.a(this.$context);
            List<String> list = this.$urls;
            Context context = this.$context;
            boolean z6 = this.$useCoverCacheKey;
            for (String str : list) {
                if (str != null && !wq.n.m0(str)) {
                    ad.h hVar = new ad.h(context);
                    if (z6) {
                        a10 = CoilExtensionsKt.coverData(hVar, str).a();
                    } else {
                        hVar.f1788c = str;
                        a10 = hVar.a();
                    }
                    ((pc.j) a11).b(a10);
                }
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
