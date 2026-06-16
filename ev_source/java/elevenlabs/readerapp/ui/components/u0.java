package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.domain.model.Pronunciation;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import io.elevenlabs.domain.model.SizeableHeaderImage;
import io.elevenlabs.domain.model.home.HomePageV4;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.AuthScreenKt;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.SignInState;
import io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsState;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.ExploreFiltersBottomSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.MultiOptionFilterBottomSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.SingleOptionFilterBottomSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeHighlightedCarouselSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListScreenKt;
import io.elevenlabs.ui.components.headers.EchoHeaderStyle;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.echo.components.EchoToastKt;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements ho.p {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14796c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14799f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f14800x0;

    public /* synthetic */ u0(String str, i3.t tVar, String str2, Integer num, ho.a aVar, List list, int i10, int i11) {
        this.f14794a = 12;
        this.f14800x0 = str;
        this.f14798e = tVar;
        this.f14797d = str2;
        this.f14799f = num;
        this.Y = aVar;
        this.Z = list;
        this.f14795b = i10;
        this.f14796c = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z SizeableHeaderImage_vtUHdqY$lambda$2;
        sn.z AuthScreenUI$lambda$11;
        sn.z BottomNavigation$lambda$1;
        sn.z DownloadsScreenUI$lambda$8;
        sn.z ExploreFiltersBottomSheet$lambda$6;
        sn.z MultiOptionFilterBottomSheet$lambda$4;
        sn.z SingleOptionFilterBottomSheet$lambda$4;
        sn.z SpokenTextTextField$lambda$3;
        sn.z PronunciationItem$lambda$9;
        sn.z EchoHeader$lambda$2;
        sn.z EchoToast$lambda$3;
        switch (this.f14794a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                SizeableHeaderImage_vtUHdqY$lambda$2 = SizeableHeaderImageKt.SizeableHeaderImage_vtUHdqY$lambda$2((SizeableHeaderImage) this.f14797d, (i3.t) this.f14798e, (h5.f) this.f14799f, (f4.r) this.Y, (p3.b1) this.Z, (String) this.f14800x0, this.f14795b, this.f14796c, (u2.m) obj, intValue);
                return SizeableHeaderImage_vtUHdqY$lambda$2;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                AuthScreenUI$lambda$11 = AuthScreenKt.AuthScreenUI$lambda$11((SignInState) this.f14797d, (ho.l) this.f14798e, (ho.a) this.f14799f, (ho.a) this.Y, (ho.a) this.Z, (ho.a) this.f14800x0, this.f14795b, this.f14796c, (u2.m) obj, intValue2);
                return AuthScreenUI$lambda$11;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                BottomNavigation$lambda$1 = BottomNavigationKt.BottomNavigation$lambda$1((na.n) this.f14797d, (Iterable) this.f14799f, (String) this.f14800x0, (ho.a) this.Y, (ho.l) this.Z, (i3.t) this.f14798e, this.f14795b, this.f14796c, (u2.m) obj, intValue3);
                return BottomNavigation$lambda$1;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                DownloadsScreenUI$lambda$8 = DownloadsScreenKt.DownloadsScreenUI$lambda$8((DownloadsState) this.f14797d, (ho.p) this.f14798e, (ho.l) this.f14799f, (ho.a) this.Y, (ho.l) this.Z, (ho.a) this.f14800x0, this.f14795b, this.f14796c, (u2.m) obj, intValue4);
                return DownloadsScreenUI$lambda$8;
            case 4:
                int intValue5 = ((Integer) obj2).intValue();
                ExploreFiltersBottomSheet$lambda$6 = ExploreFiltersBottomSheetKt.ExploreFiltersBottomSheet$lambda$6((ho.a) this.f14797d, (List) this.f14798e, (Map) this.f14799f, (ho.p) this.Y, (ho.l) this.Z, (ho.a) this.f14800x0, this.f14795b, this.f14796c, (u2.m) obj, intValue5);
                return ExploreFiltersBottomSheet$lambda$6;
            case 5:
                int intValue6 = ((Integer) obj2).intValue();
                MultiOptionFilterBottomSheet$lambda$4 = MultiOptionFilterBottomSheetKt.MultiOptionFilterBottomSheet$lambda$4((ho.a) this.f14797d, (String) this.f14800x0, (List) this.f14798e, (Set) this.f14799f, (ho.l) this.Y, (ho.a) this.Z, this.f14795b, this.f14796c, (u2.m) obj, intValue6);
                return MultiOptionFilterBottomSheet$lambda$4;
            case 6:
                int intValue7 = ((Integer) obj2).intValue();
                SingleOptionFilterBottomSheet$lambda$4 = SingleOptionFilterBottomSheetKt.SingleOptionFilterBottomSheet$lambda$4((ho.a) this.f14797d, (String) this.f14800x0, (List) this.f14798e, (String) this.f14799f, (ho.l) this.Y, (ho.a) this.Z, this.f14795b, this.f14796c, (u2.m) obj, intValue7);
                return SingleOptionFilterBottomSheet$lambda$4;
            case 7:
                int intValue8 = ((Integer) obj2).intValue();
                return HomeHighlightedCarouselSectionKt.a((HomePageV4.Section.HighlightedCarousel) this.f14797d, (ho.l) this.f14799f, (ho.a) this.Y, (i3.t) this.f14798e, (ho.l) this.Z, (String) this.f14800x0, this.f14795b, this.f14796c, (u2.m) obj, intValue8);
            case 8:
                int intValue9 = ((Integer) obj2).intValue();
                SpokenTextTextField$lambda$3 = PronunciationScreenKt.SpokenTextTextField$lambda$3((y4.w) this.f14797d, (ho.l) this.f14799f, (ho.a) this.Y, (PronunciationPreviewState) this.Z, (ho.a) this.f14800x0, (i3.t) this.f14798e, this.f14795b, this.f14796c, (u2.m) obj, intValue9);
                return SpokenTextTextField$lambda$3;
            case 9:
                int intValue10 = ((Integer) obj2).intValue();
                PronunciationItem$lambda$9 = PronunciationsListScreenKt.PronunciationItem$lambda$9((Pronunciation) this.f14797d, (PronunciationPreviewState) this.f14799f, (ho.l) this.Y, (ho.l) this.Z, (ho.a) this.f14800x0, (i3.t) this.f14798e, this.f14795b, this.f14796c, (u2.m) obj, intValue10);
                return PronunciationItem$lambda$9;
            case 10:
                int intValue11 = ((Integer) obj2).intValue();
                EchoHeader$lambda$2 = HeaderKt.EchoHeader$lambda$2((ho.q) this.f14797d, (i3.t) this.f14798e, (ho.q) this.f14799f, (EchoHeaderStyle) this.Y, (i3.f) this.Z, (ho.q) this.f14800x0, this.f14795b, this.f14796c, (u2.m) obj, intValue11);
                return EchoHeader$lambda$2;
            case 11:
                ((Integer) obj2).getClass();
                rd.c1.g((w7.h1) this.f14797d, (i3.t) this.f14798e, (ho.l) this.f14799f, (ho.p) this.Y, (ho.p) this.Z, (ho.l) this.f14800x0, (u2.m) obj, u2.r.M(this.f14795b | 1), this.f14796c);
                return sn.z.f31622a;
            default:
                int intValue12 = ((Integer) obj2).intValue();
                EchoToast$lambda$3 = EchoToastKt.EchoToast$lambda$3((String) this.f14800x0, (i3.t) this.f14798e, (String) this.f14797d, (Integer) this.f14799f, (ho.a) this.Y, (List) this.Z, this.f14795b, this.f14796c, (u2.m) obj, intValue12);
                return EchoToast$lambda$3;
        }
    }

    public /* synthetic */ u0(HomePageV4.Section.HighlightedCarousel highlightedCarousel, ho.l lVar, ho.a aVar, i3.t tVar, ho.l lVar2, String str, int i10, int i11) {
        this.f14794a = 7;
        this.f14797d = highlightedCarousel;
        this.f14799f = lVar;
        this.Y = aVar;
        this.f14798e = tVar;
        this.Z = lVar2;
        this.f14800x0 = str;
        this.f14795b = i10;
        this.f14796c = i11;
    }

    public /* synthetic */ u0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10, int i11, int i12) {
        this.f14794a = i12;
        this.f14797d = obj;
        this.f14798e = obj2;
        this.f14799f = obj3;
        this.Y = obj4;
        this.Z = obj5;
        this.f14800x0 = obj6;
        this.f14795b = i10;
        this.f14796c = i11;
    }

    public /* synthetic */ u0(Object obj, Object obj2, sn.d dVar, Object obj3, ho.a aVar, i3.t tVar, int i10, int i11, int i12) {
        this.f14794a = i12;
        this.f14797d = obj;
        this.f14799f = obj2;
        this.Y = dVar;
        this.Z = obj3;
        this.f14800x0 = aVar;
        this.f14798e = tVar;
        this.f14795b = i10;
        this.f14796c = i11;
    }

    public /* synthetic */ u0(ho.a aVar, String str, List list, Object obj, ho.l lVar, ho.a aVar2, int i10, int i11, int i12) {
        this.f14794a = i12;
        this.f14797d = aVar;
        this.f14800x0 = str;
        this.f14798e = list;
        this.f14799f = obj;
        this.Y = lVar;
        this.Z = aVar2;
        this.f14795b = i10;
        this.f14796c = i11;
    }

    public /* synthetic */ u0(na.n nVar, Iterable iterable, String str, ho.a aVar, ho.l lVar, i3.t tVar, int i10, int i11) {
        this.f14794a = 2;
        this.f14797d = nVar;
        this.f14799f = iterable;
        this.f14800x0 = str;
        this.Y = aVar;
        this.Z = lVar;
        this.f14798e = tVar;
        this.f14795b = i10;
        this.f14796c = i11;
    }
}
