package io.elevenlabs.readerapp.ui.screens.authenticated.report;

import ho.l;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17020c;

    public /* synthetic */ e(String str, ReportProblemViewModel reportProblemViewModel) {
        this.f17018a = 2;
        this.f17020c = str;
        this.f17019b = reportProblemViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ReportProblemState invokeSuspend$lambda$1;
        z ReportProblemBottomSheet$lambda$1$1$0;
        ReportProblemState load$lambda$0;
        switch (this.f17018a) {
            case 0:
                invokeSuspend$lambda$1 = ReportProblemViewModel$load$1$1.invokeSuspend$lambda$1((ReportProblemViewModel) this.f17019b, (AsyncCallResult.Error) this.f17020c, (ReportProblemState) obj);
                return invokeSuspend$lambda$1;
            case 1:
                ReportProblemBottomSheet$lambda$1$1$0 = ReportProblemBottomSheetKt.ReportProblemBottomSheet$lambda$1$1$0((l) this.f17019b, (BottomSheetControl) this.f17020c, (String) obj);
                return ReportProblemBottomSheet$lambda$1$1$0;
            default:
                load$lambda$0 = ReportProblemViewModel.load$lambda$0((String) this.f17020c, (ReportProblemViewModel) this.f17019b, (ReportProblemState) obj);
                return load$lambda$0;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, int i10) {
        this.f17018a = i10;
        this.f17019b = obj;
        this.f17020c = obj2;
    }
}
