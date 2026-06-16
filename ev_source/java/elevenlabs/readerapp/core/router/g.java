package io.elevenlabs.readerapp.core.router;

import i1.j2;
import i4.q2;
import io.elevenlabs.domain.model.Filter;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionState;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.MultiOptionFilterBottomSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.HomeReadsCarouselKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceFiltersDialogKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.elements.VoicesGridUIKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import java.util.List;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements ho.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14417a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14418b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14419c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14421e;

    public /* synthetic */ g(fr.d0 d0Var, RouterViewModel routerViewModel, na.c0 c0Var, j2 j2Var) {
        this.f14417a = 1;
        this.f14418b = d0Var;
        this.f14419c = routerViewModel;
        this.f14420d = c0Var;
        this.f14421e = j2Var;
    }

    @Override // ho.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        sn.z Router$lambda$20$0$4$0$0$45;
        sn.z Router$lambda$20$0$4$0$0$14;
        sn.z Router$lambda$20$0$4$0$0$21;
        sn.z CreateCollectionSheet$lambda$1;
        sn.z MultiOptionFilterBottomSheet$lambda$3;
        sn.z HomeReadsCarouselV3$lambda$6$1;
        sn.z filterSelect$lambda$0$5;
        sn.z VoicesGridUI$lambda$2$4;
        switch (this.f14417a) {
            case 0:
                Router$lambda$20$0$4$0$0$45 = RouterKt.Router$lambda$20$0$4$0$0$45((na.c0) this.f14420d, (fr.d0) this.f14418b, (RouterViewModel) this.f14419c, (q2) this.f14421e, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return Router$lambda$20$0$4$0$0$45;
            case 1:
                Router$lambda$20$0$4$0$0$14 = RouterKt.Router$lambda$20$0$4$0$0$14((fr.d0) this.f14418b, (RouterViewModel) this.f14419c, (na.c0) this.f14420d, (j2) this.f14421e, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return Router$lambda$20$0$4$0$0$14;
            case 2:
                Router$lambda$20$0$4$0$0$21 = RouterKt.Router$lambda$20$0$4$0$0$21((na.c0) this.f14420d, (q2) this.f14421e, (j2) this.f14418b, (RouterViewModel) this.f14419c, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return Router$lambda$20$0$4$0$0$21;
            case 3:
                CreateCollectionSheet$lambda$1 = CreateCollectionSheetKt.CreateCollectionSheet$lambda$1((CreateCollectionState) this.f14420d, (ho.l) this.f14418b, (CreateCollectionViewModel) this.f14419c, (ReadMeta) this.f14421e, (r1.y) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return CreateCollectionSheet$lambda$1;
            case 4:
                MultiOptionFilterBottomSheet$lambda$3 = MultiOptionFilterBottomSheetKt.MultiOptionFilterBottomSheet$lambda$3((List) this.f14420d, (z0) this.f14418b, (ho.a) this.f14419c, (ho.l) this.f14421e, (r1.y) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return MultiOptionFilterBottomSheet$lambda$3;
            case 5:
                HomeReadsCarouselV3$lambda$6$1 = HomeReadsCarouselKt.HomeReadsCarouselV3$lambda$6$1((List) this.f14420d, (List) this.f14418b, (ho.l) this.f14419c, (ho.l) this.f14421e, (w1.w) obj, ((Integer) obj2).intValue(), (u2.m) obj3, ((Integer) obj4).intValue());
                return HomeReadsCarouselV3$lambda$6$1;
            case 6:
                filterSelect$lambda$0$5 = VoiceFiltersDialogKt.filterSelect$lambda$0$5((List) this.f14420d, (ho.l) this.f14418b, (ho.q) this.f14419c, (Filter) this.f14421e, (r1.y) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return filterSelect$lambda$0$5;
            default:
                VoicesGridUI$lambda$2$4 = VoicesGridUIKt.VoicesGridUI$lambda$2$4((List) this.f14420d, (String) this.f14418b, (ho.l) this.f14419c, (ho.l) this.f14421e, (w1.w) obj, ((Integer) obj2).intValue(), (u2.m) obj3, ((Integer) obj4).intValue());
                return VoicesGridUI$lambda$2$4;
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f14417a = i10;
        this.f14420d = obj;
        this.f14418b = obj2;
        this.f14419c = obj3;
        this.f14421e = obj4;
    }

    public /* synthetic */ g(na.c0 c0Var, q2 q2Var, j2 j2Var, RouterViewModel routerViewModel) {
        this.f14417a = 2;
        this.f14420d = c0Var;
        this.f14421e = q2Var;
        this.f14418b = j2Var;
        this.f14419c = routerViewModel;
    }
}
