package io.elevenlabs.readerapp.ui.screens.authenticated.report;

import ho.l;
import io.elevenlabs.domain.model.AsyncCallResult;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17016b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f17015a = i10;
        this.f17016b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z ReportProblemBottomSheet$lambda$1$0$0;
        ReportProblemState retry$lambda$0;
        switch (this.f17015a) {
            case 0:
                ReportProblemBottomSheet$lambda$1$0$0 = ReportProblemBottomSheetKt.ReportProblemBottomSheet$lambda$1$0$0((ReportProblemViewModel) this.f17016b, (l) obj);
                return ReportProblemBottomSheet$lambda$1$0$0;
            case 1:
                retry$lambda$0 = ReportProblemViewModel.retry$lambda$0((ReportProblemViewModel) this.f17016b, (ReportProblemState) obj);
                return retry$lambda$0;
            default:
                return ReportProblemViewModel$load$1$1.d((AsyncCallResult.Success) this.f17016b, (ReportProblemState) obj);
        }
    }
}
