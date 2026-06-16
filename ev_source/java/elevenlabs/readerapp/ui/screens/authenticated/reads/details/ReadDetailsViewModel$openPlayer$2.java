package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsControlEvent;
import ir.i1;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$openPlayer$2", f = "ReadDetailsViewModel.kt", l = {327, 333, 335}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ReadDetailsViewModel$openPlayer$2 extends yn.i implements ho.p {
    final /* synthetic */ String $readId;
    Object L$0;
    int label;
    final /* synthetic */ ReadDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadDetailsViewModel$openPlayer$2(ReadDetailsViewModel readDetailsViewModel, String str, wn.c<? super ReadDetailsViewModel$openPlayer$2> cVar) {
        super(2, cVar);
        this.this$0 = readDetailsViewModel;
        this.$readId = str;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ReadDetailsViewModel$openPlayer$2(this.this$0, this.$readId, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ReadDetailsViewModel$openPlayer$2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        if (r12.emit(r0, r11) != r5) goto L95;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReadsService readsService;
        AsyncCallResult.AsyncCallError.ApiError apiError;
        String str;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        ToastService toastService;
        Analytics analytics;
        ReadsService readsService2;
        i1 i1Var;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            sn.a.g(obj);
                            this.this$0.queueStateUpdate(new m0(5));
                            return sn.z.f31622a;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                    i1Var = this.this$0.mutableControlEventsFlow;
                    ReadDetailsControlEvent.NavigateToPlayer navigateToPlayer = new ReadDetailsControlEvent.NavigateToPlayer(this.$readId);
                    this.L$0 = null;
                    this.label = 3;
                } else {
                    sn.a.g(obj);
                }
            } else {
                sn.a.g(obj);
                readsService = this.this$0.readsService;
                String str2 = this.$readId;
                this.label = 1;
                obj = readsService.addExploreRead(str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
            if (asyncCallResult instanceof AsyncCallResult.Success) {
                analytics = this.this$0.analytics;
                analytics.log(new Analytics.Event.ExploreClickedPlay(this.$readId));
                readsService2 = this.this$0.readsService;
                String str3 = this.$readId;
                this.L$0 = null;
                this.label = 2;
                if (readsService2.removeSampleReadFromLibrary(str3, this) == aVar) {
                    return aVar;
                }
                i1Var = this.this$0.mutableControlEventsFlow;
                ReadDetailsControlEvent.NavigateToPlayer navigateToPlayer2 = new ReadDetailsControlEvent.NavigateToPlayer(this.$readId);
                this.L$0 = null;
                this.label = 3;
            } else {
                if (asyncCallResult instanceof AsyncCallResult.Error) {
                    AsyncCallResult.AsyncCallError error = ((AsyncCallResult.Error) asyncCallResult).getError();
                    if (error instanceof AsyncCallResult.AsyncCallError.ApiError) {
                        apiError = (AsyncCallResult.AsyncCallError.ApiError) error;
                    } else {
                        apiError = null;
                    }
                    if (apiError != null) {
                        str = apiError.getCode();
                    } else {
                        str = null;
                    }
                    boolean c5 = kotlin.jvm.internal.m.c(str, "read_not_purchased");
                    ReadDetailsViewModel readDetailsViewModel = this.this$0;
                    if (!c5) {
                        resolveErrorMessageUseCase = readDetailsViewModel.resolveErrorMessageUseCase;
                        String invoke$default = ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null);
                        toastService = this.this$0.toastService;
                        ToastService.showToast$default(toastService, invoke$default, null, ToastService.ToastVariant.ERROR, 2, null);
                    } else {
                        readDetailsViewModel.navigateToPaywall();
                    }
                    this.this$0.queueStateUpdate(new m0(5));
                    return sn.z.f31622a;
                }
                throw new RuntimeException();
            }
        } catch (Throwable th) {
            this.this$0.queueStateUpdate(new m0(5));
            throw th;
        }
    }
}
