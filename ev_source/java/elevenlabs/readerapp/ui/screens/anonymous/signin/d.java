package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import android.content.Context;
import fr.d0;
import io.elevenlabs.domain.model.NotificationPrimerSource;
import io.elevenlabs.readerapp.ui.screens.authenticated.NotificationPrimerBottomSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingPage;
import io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingState;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportContentBrowserSurveySheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportContentBrowserSurveyState;
import java.util.Locale;
import q2.d2;
import q2.t0;
import q2.w0;
import s2.v;
import sn.z;
import u2.r;
import u2.z0;
import w1.e0;
import y4.w;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14858b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14859c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14862f;

    public /* synthetic */ d(OnboardingState onboardingState, OnboardingPage.SurveyPage surveyPage, ho.l lVar, e0 e0Var, d0 d0Var) {
        this.f14857a = 2;
        this.f14859c = onboardingState;
        this.f14861e = surveyPage;
        this.f14858b = lVar;
        this.f14862f = e0Var;
        this.f14860d = d0Var;
    }

    @Override // ho.a
    public final Object invoke() {
        z AuthScreen$lambda$13$0;
        z NotificationPrimerBottomSheetUI$lambda$1$1$0$0;
        z OnboardingScreenUI$lambda$0$0$3$2$0;
        z ImportContentBrowserSurveySheetUI$lambda$4$1$0;
        String str;
        switch (this.f14857a) {
            case 0:
                AuthScreen$lambda$13$0 = AuthScreenKt.AuthScreen$lambda$13$0((AuthViewModel) this.f14859c, (d0) this.f14860d, (z0) this.f14861e, (Context) this.f14858b, (q6.j) this.f14862f);
                return AuthScreen$lambda$13$0;
            case 1:
                NotificationPrimerBottomSheetUI$lambda$1$1$0$0 = NotificationPrimerBottomSheetKt.NotificationPrimerBottomSheetUI$lambda$1$1$0$0((ho.a) this.f14859c, (ho.l) this.f14860d, (NotificationPrimerSource) this.f14861e, (Context) this.f14858b, (ho.a) this.f14862f);
                return NotificationPrimerBottomSheetUI$lambda$1$1$0$0;
            case 2:
                OnboardingScreenUI$lambda$0$0$3$2$0 = OnboardingScreenKt.OnboardingScreenUI$lambda$0$0$3$2$0((OnboardingState) this.f14859c, (OnboardingPage.SurveyPage) this.f14861e, (ho.l) this.f14858b, (e0) this.f14862f, (d0) this.f14860d);
                return OnboardingScreenUI$lambda$0$0$3$2$0;
            case 3:
                ImportContentBrowserSurveySheetUI$lambda$4$1$0 = ImportContentBrowserSurveySheetKt.ImportContentBrowserSurveySheetUI$lambda$4$1$0((ho.l) this.f14859c, (ho.l) this.f14860d, (ImportContentBrowserSurveyState) this.f14861e, (ho.a) this.f14858b, (ho.a) this.f14862f);
                return ImportContentBrowserSurveySheetUI$lambda$4$1$0;
            case 4:
                t0 t0Var = (t0) this.f14859c;
                v vVar = (v) this.f14860d;
                s2.d0 d0Var = (s2.d0) this.f14858b;
                Locale locale = (Locale) this.f14862f;
                z0 z0Var = (z0) this.f14861e;
                if (((w) z0Var.getValue()).f38321a.f31041b.length() > 0) {
                    str = t0Var.a(vVar.j(((w) z0Var.getValue()).f38321a.f31041b, d0Var.f30744c, locale), locale);
                } else {
                    str = "";
                }
                return r.A(str);
            default:
                return new d2((Long) this.f14859c, (Long) this.f14860d, (no.g) this.f14861e, 0, (w0) this.f14858b, (Locale) this.f14862f);
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f14857a = i10;
        this.f14859c = obj;
        this.f14860d = obj2;
        this.f14861e = obj3;
        this.f14858b = obj4;
        this.f14862f = obj5;
    }

    public /* synthetic */ d(t0 t0Var, v vVar, s2.d0 d0Var, Locale locale, z0 z0Var) {
        this.f14857a = 4;
        this.f14859c = t0Var;
        this.f14860d = vVar;
        this.f14858b = d0Var;
        this.f14862f = locale;
        this.f14861e = z0Var;
    }
}
