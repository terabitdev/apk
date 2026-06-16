package io.elevenlabs.readerapp.ui.screens.authenticated.report;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ReportLinks;
import io.elevenlabs.domain.services.AppConfigService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.report.ReportProblemViewModel$load$1$1", f = "ReportProblemViewModel.kt", l = {30}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ReportProblemViewModel$load$1$1 extends i implements p {
    final /* synthetic */ String $readId;
    int label;
    final /* synthetic */ ReportProblemViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportProblemViewModel$load$1$1(ReportProblemViewModel reportProblemViewModel, String str, wn.c<? super ReportProblemViewModel$load$1$1> cVar) {
        super(2, cVar);
        this.this$0 = reportProblemViewModel;
        this.$readId = str;
    }

    public static final ReportProblemState invokeSuspend$lambda$0(AsyncCallResult asyncCallResult, ReportProblemState reportProblemState) {
        return ReportProblemState.copy$default(reportProblemState, null, (ReportLinks) ((AsyncCallResult.Success) asyncCallResult).getData(), false, null, 9, null);
    }

    public static final ReportProblemState invokeSuspend$lambda$1(ReportProblemViewModel reportProblemViewModel, AsyncCallResult asyncCallResult, ReportProblemState reportProblemState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = reportProblemViewModel.resolveErrorMessageUseCase;
        return ReportProblemState.copy$default(reportProblemState, null, null, false, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), 3, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new ReportProblemViewModel$load$1$1(this.this$0, this.$readId, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((ReportProblemViewModel$load$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        AppConfigService appConfigService;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            appConfigService = this.this$0.appConfigService;
            String str = this.$readId;
            this.label = 1;
            obj = appConfigService.getReportLinks(str, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Success) {
            this.this$0.queueStateUpdate(new c((AsyncCallResult.Success) asyncCallResult, 2));
        } else if (asyncCallResult instanceof AsyncCallResult.Error) {
            ReportProblemViewModel reportProblemViewModel = this.this$0;
            reportProblemViewModel.queueStateUpdate(new e(reportProblemViewModel, (AsyncCallResult.Error) asyncCallResult, 0));
        } else {
            c6.p();
            return null;
        }
        return z.f31622a;
    }
}
