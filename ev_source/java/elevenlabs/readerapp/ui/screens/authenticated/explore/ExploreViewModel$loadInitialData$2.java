package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ReadsExplorePage;
import io.elevenlabs.domain.services.ReadsExploreService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$loadInitialData$2", f = "ExploreViewModel.kt", l = {136, 142}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ExploreViewModel$loadInitialData$2 extends yn.i implements ho.p {
    final /* synthetic */ String $currency;
    final /* synthetic */ String $languageCode;
    int label;
    final /* synthetic */ ExploreViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreViewModel$loadInitialData$2(ExploreViewModel exploreViewModel, String str, String str2, wn.c<? super ExploreViewModel$loadInitialData$2> cVar) {
        super(2, cVar);
        this.this$0 = exploreViewModel;
        this.$languageCode = str;
        this.$currency = str2;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new ExploreViewModel$loadInitialData$2(this.this$0, this.$languageCode, this.$currency, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((ExploreViewModel$loadInitialData$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (((ir.i) r15).collect(r0, r14) == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r15 == r3) goto L33;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ExploreViewModel$loadInitialData$2 exploreViewModel$loadInitialData$2;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
            exploreViewModel$loadInitialData$2 = this;
        } else {
            sn.a.g(obj);
            ReadsExploreService readsExploreService = this.this$0.readsExploreService;
            String str = this.$languageCode;
            String str2 = this.$currency;
            this.label = 1;
            exploreViewModel$loadInitialData$2 = this;
            obj = ReadsExploreService.getExploreIndex$default(readsExploreService, str, str2, u.f33548a, null, null, false, exploreViewModel$loadInitialData$2, 32, null);
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(exploreViewModel$loadInitialData$2.this$0);
        exploreViewModel$loadInitialData$2.label = 2;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$loadInitialData$2$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements ir.j {
        final /* synthetic */ ExploreViewModel this$0;

        public AnonymousClass1(ExploreViewModel exploreViewModel) {
            this.this$0 = exploreViewModel;
        }

        public static final ExploreState emit$lambda$0(ExploreViewModel exploreViewModel, AsyncCallResult asyncCallResult, ExploreState exploreState) {
            ResolveErrorMessageUseCase resolveErrorMessageUseCase;
            exploreState.getClass();
            resolveErrorMessageUseCase = exploreViewModel.resolveErrorMessageUseCase;
            return ExploreState.copy$default(exploreState, false, null, null, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, null, null, null, null, null, 1014, null);
        }

        public static final ExploreState emit$lambda$1(AsyncCallResult asyncCallResult, ExploreState exploreState) {
            exploreState.getClass();
            AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
            return ExploreState.copy$default(exploreState, false, ((ReadsExplorePage) success.getData()).getPageFilters(), (ReadsExplorePage) success.getData(), null, null, null, null, null, null, null, 1008, null);
        }

        public final Object emit(AsyncCallResult<ReadsExplorePage> asyncCallResult, wn.c<? super z> cVar) {
            if (asyncCallResult instanceof AsyncCallResult.Error) {
                ExploreViewModel exploreViewModel = this.this$0;
                exploreViewModel.queueStateUpdate(new q(exploreViewModel, (AsyncCallResult.Error) asyncCallResult, 1));
            } else if (asyncCallResult instanceof AsyncCallResult.Success) {
                AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
                this.this$0.queueStateUpdate(new s(success, 1));
                this.this$0.fetchPricesForSections(((ReadsExplorePage) success.getData()).getSections());
            } else {
                c6.p();
                return null;
            }
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((AsyncCallResult<ReadsExplorePage>) obj, (wn.c<? super z>) cVar);
        }
    }
}
