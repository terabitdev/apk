package io.elevenlabs.readerapp.core;

import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14359c;

    public /* synthetic */ g(Object obj, Object obj2, int i10) {
        this.f14357a = i10;
        this.f14358b = obj;
        this.f14359c = obj2;
    }

    @Override // ho.a
    public final Object invoke() {
        z OpenQuestionView$lambda$3$1$0;
        z SurveySheetUI$lambda$3$0$0$1$1$0$0$0;
        switch (this.f14357a) {
            case 0:
                return MviViewModel$2$3$1.d((MviViewModel) this.f14358b, this.f14359c);
            case 1:
                OpenQuestionView$lambda$3$1$0 = SurveySheetKt.OpenQuestionView$lambda$3$1$0((ho.l) this.f14358b, (z0) this.f14359c);
                return OpenQuestionView$lambda$3$1$0;
            default:
                SurveySheetUI$lambda$3$0$0$1$1$0$0$0 = SurveySheetKt.SurveySheetUI$lambda$3$0$0$1$1$0$0$0((ho.a) this.f14358b, (ho.a) this.f14359c);
                return SurveySheetUI$lambda$3$0$0$1$1$0$0$0;
        }
    }
}
