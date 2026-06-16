package io.elevenlabs.readerapp.ui.screens.authenticated.home.elements;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.UserConfigRequest;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.UserConfigService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;
import sn.z;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.elements.DailyStreakSettingsViewModel$save$1$1", f = "DailyStreakSettingsScreen.kt", l = {72}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class DailyStreakSettingsViewModel$save$1$1 extends i implements p {
    final /* synthetic */ Long $goalMinutes;
    int label;
    final /* synthetic */ DailyStreakSettingsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyStreakSettingsViewModel$save$1$1(DailyStreakSettingsViewModel dailyStreakSettingsViewModel, Long l4, wn.c<? super DailyStreakSettingsViewModel$save$1$1> cVar) {
        super(2, cVar);
        this.this$0 = dailyStreakSettingsViewModel;
        this.$goalMinutes = l4;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new DailyStreakSettingsViewModel$save$1$1(this.this$0, this.$goalMinutes, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((DailyStreakSettingsViewModel$save$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object save;
        ToastService toastService;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
                save = obj;
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            UserConfigService userConfigService = this.this$0.userConfigService;
            UserConfigRequest userConfigRequest = new UserConfigRequest(this.$goalMinutes, null, null, null, null, null, null, null, null, null, null, 2046, null);
            this.label = 1;
            save = userConfigService.save(userConfigRequest, this);
            xn.a aVar = xn.a.f37986a;
            if (save == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) save;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            toastService = this.this$0.toastService;
            resolveErrorMessageUseCase = this.this$0.resolveErrorMessageUseCase;
            ToastService.showToast$default(toastService, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
        } else if (asyncCallResult instanceof AsyncCallResult.Success) {
            this.this$0.queueStateUpdate(new d(0));
        } else {
            c6.p();
            return null;
        }
        this.this$0.queueStateUpdate(new d(1));
        return z.f31622a;
    }
}
