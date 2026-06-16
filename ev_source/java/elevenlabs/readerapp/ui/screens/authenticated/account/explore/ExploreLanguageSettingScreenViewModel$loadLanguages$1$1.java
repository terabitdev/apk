package io.elevenlabs.readerapp.ui.screens.authenticated.account.explore;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.CurrencyUtilsKt;
import io.elevenlabs.domain.model.KeyLabel;
import io.elevenlabs.domain.model.PageFilter;
import io.elevenlabs.domain.model.ReadsExplorePage;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.domain.services.ReadsExploreService;
import io.elevenlabs.domain.services.UserConfigService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import ir.j;
import ir.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.t;
import tn.u;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.ExploreLanguageSettingScreenViewModel$loadLanguages$1$1", f = "ExploreLanguageSettingScreenViewModel.kt", l = {42, 45, 49}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ExploreLanguageSettingScreenViewModel$loadLanguages$1$1 extends i implements p {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ExploreLanguageSettingScreenViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreLanguageSettingScreenViewModel$loadLanguages$1$1(ExploreLanguageSettingScreenViewModel exploreLanguageSettingScreenViewModel, wn.c<? super ExploreLanguageSettingScreenViewModel$loadLanguages$1$1> cVar) {
        super(2, cVar);
        this.this$0 = exploreLanguageSettingScreenViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new ExploreLanguageSettingScreenViewModel$loadLanguages$1$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((ExploreLanguageSettingScreenViewModel$loadLanguages$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ab, code lost:
    
        if (((ir.i) r0).collect(r1, r13) == r12) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ad, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        if (r0 == r12) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r2 == r12) goto L43;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReadsExploreService readsExploreService;
        String persistedExploreLanguage;
        UserConfigService userConfigService;
        Object u6;
        Logger logger;
        ReadsExploreService readsExploreService2;
        Object exploreIndex$default;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        sn.a.g(obj);
                        return z.f31622a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                exploreIndex$default = obj;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
            } else {
                persistedExploreLanguage = (String) this.L$0;
                sn.a.g(obj);
                u6 = obj;
            }
        } else {
            sn.a.g(obj);
            readsExploreService = this.this$0.readsExploreService;
            persistedExploreLanguage = readsExploreService.getPersistedExploreLanguage();
            userConfigService = this.this$0.userConfigService;
            ir.i config = userConfigService.getConfig();
            this.L$0 = persistedExploreLanguage;
            this.label = 1;
            u6 = r.u(config, this);
        }
        String storeCountryCode = ((UserConfig) u6).getStoreCountryCode();
        logger = this.this$0.logger;
        String deriveStoreCurrencyCode = CurrencyUtilsKt.deriveStoreCurrencyCode(storeCountryCode, logger, "ExploreLanguageSettingVM");
        readsExploreService2 = this.this$0.readsExploreService;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        exploreIndex$default = ReadsExploreService.getExploreIndex$default(readsExploreService2, persistedExploreLanguage, deriveStoreCurrencyCode, u.f33548a, null, null, false, this, 56, null);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.ExploreLanguageSettingScreenViewModel$loadLanguages$1$1$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements j {
        final /* synthetic */ ExploreLanguageSettingScreenViewModel this$0;

        public AnonymousClass1(ExploreLanguageSettingScreenViewModel exploreLanguageSettingScreenViewModel) {
            this.this$0 = exploreLanguageSettingScreenViewModel;
        }

        public static final ExploreLanguageState emit$lambda$0(ExploreLanguageSettingScreenViewModel exploreLanguageSettingScreenViewModel, AsyncCallResult asyncCallResult, ExploreLanguageState exploreLanguageState) {
            ResolveErrorMessageUseCase resolveErrorMessageUseCase;
            exploreLanguageState.getClass();
            resolveErrorMessageUseCase = exploreLanguageSettingScreenViewModel.resolveErrorMessageUseCase;
            return ExploreLanguageState.copy$default(exploreLanguageState, false, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, null, 12, null);
        }

        public static final ExploreLanguageState emit$lambda$1(AsyncCallResult asyncCallResult, ExploreLanguageState exploreLanguageState) {
            T t10;
            List<KeyLabel> list;
            exploreLanguageState.getClass();
            AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
            List<PageFilter> pageFilters = ((ReadsExplorePage) success.getData()).getPageFilters();
            ArrayList arrayList = new ArrayList();
            for (T t11 : pageFilters) {
                if (t11 instanceof PageFilter.ExplorePageOneOptionFilterResponseModel) {
                    arrayList.add(t11);
                }
            }
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    t10 = it.next();
                    if (m.c(((PageFilter.ExplorePageOneOptionFilterResponseModel) t10).getKey(), "content_language")) {
                        break;
                    }
                } else {
                    t10 = (T) null;
                    break;
                }
            }
            PageFilter.ExplorePageOneOptionFilterResponseModel explorePageOneOptionFilterResponseModel = t10;
            if (explorePageOneOptionFilterResponseModel == null || (list = explorePageOneOptionFilterResponseModel.getOptions()) == null) {
                list = t.f33547a;
            }
            String selectedLanguageCode = exploreLanguageState.getSelectedLanguageCode();
            if (selectedLanguageCode == null) {
                selectedLanguageCode = ((ReadsExplorePage) success.getData()).getLanguage();
            }
            return exploreLanguageState.copy(false, null, list, selectedLanguageCode);
        }

        public final Object emit(AsyncCallResult<ReadsExplorePage> asyncCallResult, wn.c<? super z> cVar) {
            if (asyncCallResult instanceof AsyncCallResult.Error) {
                ExploreLanguageSettingScreenViewModel exploreLanguageSettingScreenViewModel = this.this$0;
                exploreLanguageSettingScreenViewModel.queueStateUpdate(new h(exploreLanguageSettingScreenViewModel, (AsyncCallResult.Error) asyncCallResult, 0));
            } else if (asyncCallResult instanceof AsyncCallResult.Success) {
                this.this$0.queueStateUpdate(new c((AsyncCallResult.Success) asyncCallResult, 2));
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
