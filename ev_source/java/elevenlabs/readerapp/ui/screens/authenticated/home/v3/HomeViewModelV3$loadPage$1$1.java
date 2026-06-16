package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.home.HomePageV3;
import io.elevenlabs.domain.services.HomeService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$loadPage$1$1", f = "HomeViewModelV3.kt", l = {165}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class HomeViewModelV3$loadPage$1$1 extends yn.i implements ho.p {
    int label;
    final /* synthetic */ HomeViewModelV3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModelV3$loadPage$1$1(HomeViewModelV3 homeViewModelV3, wn.c<? super HomeViewModelV3$loadPage$1$1> cVar) {
        super(2, cVar);
        this.this$0 = homeViewModelV3;
    }

    public static final HomeStateV3 invokeSuspend$lambda$0(HomeViewModelV3 homeViewModelV3, AsyncCallResult asyncCallResult, HomeStateV3 homeStateV3) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = homeViewModelV3.resolveErrorMessageUseCase;
        return HomeStateV3.copy$default(homeStateV3, false, false, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, null, null, 0L, false, null, null, null, false, false, null, null, 32761, null);
    }

    public static final HomeStateV3 invokeSuspend$lambda$1(HomePageV3 homePageV3, String str, HomeStateV3 homeStateV3) {
        return HomeStateV3.copy$default(homeStateV3, false, false, null, homePageV3, null, null, 0L, false, null, null, str, false, false, null, null, 31733, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new HomeViewModelV3$loadPage$1$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((HomeViewModelV3$loadPage$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        HomeService homeService;
        String str;
        ir.i iVar;
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
            homeService = this.this$0.homeService;
            this.label = 1;
            obj = homeService.getHomeV3(this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            HomeViewModelV3 homeViewModelV3 = this.this$0;
            homeViewModelV3.queueStateUpdate(new t(homeViewModelV3, asyncCallResult, 1));
        } else if (asyncCallResult instanceof AsyncCallResult.Success) {
            HomePageV3 homePageV3 = (HomePageV3) ((AsyncCallResult.Success) asyncCallResult).getData();
            HomePageV3.Subpage subpage = (HomePageV3.Subpage) tn.o.y0(homePageV3.getSubpages());
            if (subpage != null) {
                str = subpage.getId();
            } else {
                str = null;
            }
            this.this$0.queueStateUpdate(new t(homePageV3, str, 2));
            if (str != null) {
                iVar = this.this$0._subpagePagingData;
                if (iVar == null) {
                    this.this$0.initSubpagePagingData(str);
                }
            }
        } else {
            c6.p();
            return null;
        }
        return z.f31622a;
    }
}
