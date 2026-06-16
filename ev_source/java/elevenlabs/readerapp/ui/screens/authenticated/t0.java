package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.model.Pronunciation;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeScreenV3Kt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeStateV3;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPronunciationsKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportContentBrowserSurveySheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportContentBrowserSurveyState;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportContentBrowserSurveyViewModel;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t0 implements ho.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f17085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17086c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17089f;

    public /* synthetic */ t0(ho.l lVar, Pronunciation pronunciation, ho.a aVar, PronunciationPreviewState pronunciationPreviewState, ho.a aVar2) {
        this.f17084a = 3;
        this.f17085b = lVar;
        this.f17086c = pronunciation;
        this.f17087d = aVar;
        this.f17088e = pronunciationPreviewState;
        this.f17089f = aVar2;
    }

    @Override // ho.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        sn.z OnboardingScreenUI$lambda$0$0$3;
        sn.z exploreFilteredContent$lambda$3;
        sn.z homeItems$lambda$4;
        sn.z PronunciationExistsDialog$lambda$0;
        sn.z ImportContentBrowserSurveySheet$lambda$0;
        switch (this.f17084a) {
            case 0:
                int intValue = ((Integer) obj4).intValue();
                OnboardingScreenUI$lambda$0$0$3 = OnboardingScreenKt.OnboardingScreenUI$lambda$0$0$3((OnboardingState) this.f17086c, this.f17085b, (w1.e0) this.f17087d, (fr.d0) this.f17088e, (Long) this.f17089f, (w1.w) obj, ((Integer) obj2).intValue(), (u2.m) obj3, intValue);
                return OnboardingScreenUI$lambda$0$0$3;
            case 1:
                int intValue2 = ((Integer) obj4).intValue();
                exploreFilteredContent$lambda$3 = ExploreScreenKt.exploreFilteredContent$lambda$3((ua.b) this.f17086c, this.f17085b, (ho.l) this.f17087d, (ho.l) this.f17088e, (String) this.f17089f, (t1.b) obj, ((Integer) obj2).intValue(), (u2.m) obj3, intValue2);
                return exploreFilteredContent$lambda$3;
            case 2:
                int intValue3 = ((Integer) obj4).intValue();
                homeItems$lambda$4 = HomeScreenV3Kt.homeItems$lambda$4((ua.b) this.f17086c, (HomeStateV3) this.f17087d, this.f17085b, (ho.l) this.f17088e, (ho.l) this.f17089f, (t1.b) obj, ((Integer) obj2).intValue(), (u2.m) obj3, intValue3);
                return homeItems$lambda$4;
            case 3:
                int intValue4 = ((Integer) obj4).intValue();
                PronunciationExistsDialog$lambda$0 = PlayerPronunciationsKt.PronunciationExistsDialog$lambda$0(this.f17085b, (Pronunciation) this.f17086c, (ho.a) this.f17087d, (PronunciationPreviewState) this.f17088e, (ho.a) this.f17089f, (r1.y) obj, (BottomSheetControl) obj2, (u2.m) obj3, intValue4);
                return PronunciationExistsDialog$lambda$0;
            default:
                int intValue5 = ((Integer) obj4).intValue();
                ImportContentBrowserSurveySheet$lambda$0 = ImportContentBrowserSurveySheetKt.ImportContentBrowserSurveySheet$lambda$0((ImportContentBrowserSurveyState) this.f17086c, (ho.a) this.f17087d, (ho.a) this.f17088e, this.f17085b, (ImportContentBrowserSurveyViewModel) this.f17089f, (r1.y) obj, (BottomSheetControl) obj2, (u2.m) obj3, intValue5);
                return ImportContentBrowserSurveySheet$lambda$0;
        }
    }

    public /* synthetic */ t0(ImportContentBrowserSurveyState importContentBrowserSurveyState, ho.a aVar, ho.a aVar2, ho.l lVar, ImportContentBrowserSurveyViewModel importContentBrowserSurveyViewModel) {
        this.f17084a = 4;
        this.f17086c = importContentBrowserSurveyState;
        this.f17087d = aVar;
        this.f17088e = aVar2;
        this.f17085b = lVar;
        this.f17089f = importContentBrowserSurveyViewModel;
    }

    public /* synthetic */ t0(Object obj, ho.l lVar, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17084a = i10;
        this.f17086c = obj;
        this.f17085b = lVar;
        this.f17087d = obj2;
        this.f17088e = obj3;
        this.f17089f = obj4;
    }

    public /* synthetic */ t0(ua.b bVar, HomeStateV3 homeStateV3, ho.l lVar, ho.l lVar2, ho.l lVar3) {
        this.f17084a = 2;
        this.f17086c = bVar;
        this.f17087d = homeStateV3;
        this.f17085b = lVar;
        this.f17088e = lVar2;
        this.f17089f = lVar3;
    }
}
