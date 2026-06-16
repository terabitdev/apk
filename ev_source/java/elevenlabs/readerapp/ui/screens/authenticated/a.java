package io.elevenlabs.readerapp.ui.screens.authenticated;

import a2.h2;
import i1.j2;
import io.elevenlabs.domain.model.AuthorProfile;
import io.elevenlabs.domain.model.AuthorProfilePage;
import io.elevenlabs.domain.model.OnboardingSurvey;
import io.elevenlabs.domain.model.Pronunciation;
import io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingPage;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ContentPreferencesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ManageContentInterestsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ManageContentInterestsState;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.ExploreLargeGridCollectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeScreenV3Kt;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListScreenKt;
import io.elevenlabs.ui.components.ActionConfig;
import io.elevenlabs.ui.components.ActionSpecBuilder;
import java.util.List;
import java.util.Map;
import r1.l2;
import r1.z1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sn.d f14917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14918c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14921f;

    public /* synthetic */ a(Object obj, vk.i iVar, wk.i iVar2, int i10, c3.j jVar, u2.z0 z0Var) {
        this.f14916a = 8;
        this.f14919d = obj;
        this.f14920e = iVar;
        this.f14921f = iVar2;
        this.f14917b = jVar;
        this.f14918c = z0Var;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z BottomNavigation$lambda$0$0;
        sn.z QuestionContent$lambda$2;
        sn.z ContentPreferencesScreenUI$lambda$0$0$0$1;
        sn.z ManageContentInterestsUI$lambda$4;
        sn.z AuthorProfileContent$lambda$3$0$0$2$1;
        sn.z ExploreLargeGridCollection$lambda$0$0;
        sn.z HomeScreenV3UI$lambda$5$0$12$2;
        sn.z PronunciationItem$lambda$5;
        boolean z6;
        int i10;
        switch (this.f14916a) {
            case 0:
                BottomNavigation$lambda$0$0 = BottomNavigationKt.BottomNavigation$lambda$0$0((Iterable) this.f14919d, (String) this.f14920e, (na.n) this.f14921f, (ho.l) this.f14917b, (ho.a) this.f14918c, (l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return BottomNavigation$lambda$0$0;
            case 1:
                QuestionContent$lambda$2 = OnboardingScreenKt.QuestionContent$lambda$2((OnboardingSurvey.Question) this.f14919d, (ho.l) this.f14917b, (OnboardingPage.SurveyPage) this.f14920e, (OnboardingState) this.f14921f, (ho.a) this.f14918c, (r1.y) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return QuestionContent$lambda$2;
            case 2:
                ContentPreferencesScreenUI$lambda$0$0$0$1 = ContentPreferencesScreenKt.ContentPreferencesScreenUI$lambda$0$0$0$1((ho.a) this.f14918c, (ho.a) this.f14919d, (ho.a) this.f14920e, (Boolean) this.f14921f, (ho.l) this.f14917b, (r1.s) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return ContentPreferencesScreenUI$lambda$0$0$0$1;
            case 3:
                ManageContentInterestsUI$lambda$4 = ManageContentInterestsScreenKt.ManageContentInterestsUI$lambda$4((ManageContentInterestsState) this.f14919d, (ho.a) this.f14918c, (ho.a) this.f14920e, (ho.p) this.f14921f, (ho.a) this.f14917b, (z1) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return ManageContentInterestsUI$lambda$4;
            case 4:
                AuthorProfileContent$lambda$3$0$0$2$1 = AuthorProfileScreenKt.AuthorProfileContent$lambda$3$0$0$2$1((Map) this.f14919d, (String) this.f14920e, (AuthorProfilePage) this.f14921f, (ho.p) this.f14917b, (AuthorProfile) this.f14918c, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return AuthorProfileContent$lambda$3$0$0$2$1;
            case 5:
                ExploreLargeGridCollection$lambda$0$0 = ExploreLargeGridCollectionKt.ExploreLargeGridCollection$lambda$0$0((List) this.f14919d, (Integer) this.f14921f, (ho.l) this.f14917b, (ho.l) this.f14918c, (String) this.f14920e, (r1.u) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return ExploreLargeGridCollection$lambda$0$0;
            case 6:
                HomeScreenV3UI$lambda$5$0$12$2 = HomeScreenV3Kt.HomeScreenV3UI$lambda$5$0$12$2((j2) this.f14919d, (i1.o) this.f14920e, (ho.a) this.f14918c, (ho.l) this.f14917b, (ho.a) this.f14921f, (l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return HomeScreenV3UI$lambda$5$0$12$2;
            case 7:
                PronunciationItem$lambda$5 = PronunciationsListScreenKt.PronunciationItem$lambda$5((ActionConfig) this.f14919d, (ho.l) this.f14917b, (Pronunciation) this.f14920e, (ActionConfig) this.f14921f, (u2.z0) this.f14918c, (ActionSpecBuilder) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return PronunciationItem$lambda$5;
            default:
                vk.i iVar = (vk.i) this.f14920e;
                wk.i iVar2 = (wk.i) this.f14921f;
                c3.j jVar = (c3.j) this.f14917b;
                u2.z0 z0Var = (u2.z0) this.f14918c;
                r1.u uVar = (r1.u) obj;
                u2.m mVar = (u2.m) obj2;
                int intValue = ((Integer) obj3).intValue();
                uVar.getClass();
                if ((intValue & 6) == 0) {
                    if (((u2.q) mVar).f(uVar)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue |= i10;
                }
                boolean z10 = false;
                if ((intValue & 19) != 18) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                u2.q qVar = (u2.q) mVar;
                if (qVar.O(intValue & 1, z6)) {
                    boolean f10 = qVar.f(iVar);
                    int i11 = intValue & 14;
                    if (i11 == 4) {
                        z10 = true;
                    }
                    boolean f11 = f10 | z10 | qVar.f(iVar2);
                    Object L = qVar.L();
                    if (f11 || L == u2.l.f33918a) {
                        L = new h2(iVar, uVar, iVar2, null, 4);
                        qVar.h0(L);
                    }
                    u2.r.g(this.f14919d, iVar, (ho.p) L, qVar);
                    jVar.invoke(uVar, (vk.h) z0Var.getValue(), qVar, Integer.valueOf(i11));
                } else {
                    qVar.R();
                }
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ a(j2 j2Var, i1.o oVar, ho.a aVar, ho.l lVar, ho.a aVar2) {
        this.f14916a = 6;
        this.f14919d = j2Var;
        this.f14920e = oVar;
        this.f14918c = aVar;
        this.f14917b = lVar;
        this.f14921f = aVar2;
    }

    public /* synthetic */ a(ManageContentInterestsState manageContentInterestsState, ho.a aVar, ho.a aVar2, ho.p pVar, ho.a aVar3) {
        this.f14916a = 3;
        this.f14919d = manageContentInterestsState;
        this.f14918c = aVar;
        this.f14920e = aVar2;
        this.f14921f = pVar;
        this.f14917b = aVar3;
    }

    public /* synthetic */ a(Object obj, ho.l lVar, Object obj2, Object obj3, Object obj4, int i10) {
        this.f14916a = i10;
        this.f14919d = obj;
        this.f14917b = lVar;
        this.f14920e = obj2;
        this.f14921f = obj3;
        this.f14918c = obj4;
    }

    public /* synthetic */ a(Object obj, String str, Object obj2, sn.d dVar, Object obj3, int i10) {
        this.f14916a = i10;
        this.f14919d = obj;
        this.f14920e = str;
        this.f14921f = obj2;
        this.f14917b = dVar;
        this.f14918c = obj3;
    }

    public /* synthetic */ a(ho.a aVar, ho.a aVar2, ho.a aVar3, Boolean bool, ho.l lVar) {
        this.f14916a = 2;
        this.f14918c = aVar;
        this.f14919d = aVar2;
        this.f14920e = aVar3;
        this.f14921f = bool;
        this.f14917b = lVar;
    }

    public /* synthetic */ a(List list, Integer num, ho.l lVar, ho.l lVar2, String str) {
        this.f14916a = 5;
        this.f14919d = list;
        this.f14921f = num;
        this.f14917b = lVar;
        this.f14918c = lVar2;
        this.f14920e = str;
    }
}
