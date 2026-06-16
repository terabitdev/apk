package io.elevenlabs.readerapp.core;

import io.elevenlabs.readerapp.core.Survey;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14365b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.a f14366c;

    public /* synthetic */ i(Object obj, ho.a aVar, int i10) {
        this.f14364a = i10;
        this.f14365b = obj;
        this.f14366c = aVar;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z SurveySheetUI$lambda$3$0$0$1$0$0$0;
        SurveyState handleChoice$lambda$0;
        z SurveySheetUI$lambda$3$0$0$1$0$0;
        switch (this.f14364a) {
            case 0:
                SurveySheetUI$lambda$3$0$0$1$0$0$0 = SurveySheetKt.SurveySheetUI$lambda$3$0$0$1$0$0$0((Survey.Question.Choice) this.f14365b, this.f14366c, (SurveyViewModel) obj);
                return SurveySheetUI$lambda$3$0$0$1$0$0$0;
            case 1:
                handleChoice$lambda$0 = SurveyViewModel.handleChoice$lambda$0((Survey.Question.Choice) this.f14365b, this.f14366c, (SurveyState) obj);
                return handleChoice$lambda$0;
            default:
                SurveySheetUI$lambda$3$0$0$1$0$0 = SurveySheetKt.SurveySheetUI$lambda$3$0$0$1$0$0((ho.l) this.f14365b, this.f14366c, (Survey.Question.Choice) obj);
                return SurveySheetUI$lambda$3$0$0$1$0$0;
        }
    }
}
