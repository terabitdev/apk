package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.domain.model.home.HomePageV4;
import io.elevenlabs.domain.services.HomeService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.ui.delegates.PriceFetcherKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$loadPage$1$1", f = "HomeViewModelV4.kt", l = {183, 185}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class HomeViewModelV4$loadPage$1$1 extends yn.i implements ho.p {
    Object L$0;
    int label;
    final /* synthetic */ HomeViewModelV4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModelV4$loadPage$1$1(HomeViewModelV4 homeViewModelV4, wn.c<? super HomeViewModelV4$loadPage$1$1> cVar) {
        super(2, cVar);
        this.this$0 = homeViewModelV4;
    }

    public static final HomeStateV4 invokeSuspend$lambda$1(HomeViewModelV4 homeViewModelV4, AsyncCallResult asyncCallResult, HomeStateV4 homeStateV4) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = homeViewModelV4.resolveErrorMessageUseCase;
        return HomeStateV4.copy$default(homeStateV4, false, false, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, null, null, 0L, false, null, null, null, null, false, false, null, null, 65529, null);
    }

    public static final HomeStateV4 invokeSuspend$lambda$2(AsyncCallResult asyncCallResult, HomeStateV4 homeStateV4) {
        return HomeStateV4.copy$default(homeStateV4, false, false, null, (HomePageV4) ((AsyncCallResult.Success) asyncCallResult).getData(), null, null, 0L, false, null, null, null, null, false, false, null, null, 65525, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new HomeViewModelV4$loadPage$1$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((HomeViewModelV4$loadPage$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x004b, code lost:
    
        if (r5 == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0037, code lost:
    
        if (r5 == r3) goto L75;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        HomeService homeService;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
                    if (asyncCallResult instanceof AsyncCallResult.Error) {
                        HomeViewModelV4 homeViewModelV4 = this.this$0;
                        homeViewModelV4.queueStateUpdate(new v(homeViewModelV4, (AsyncCallResult.Error) asyncCallResult));
                    } else if (asyncCallResult instanceof AsyncCallResult.Success) {
                        AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
                        this.this$0.queueStateUpdate(new t(success, 4));
                        List<HomePageV4.Section> sections = ((HomePageV4) success.getData()).getSections();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : sections) {
                            if (obj2 instanceof HomePageV4.Section.HighlightedCarousel) {
                                arrayList.add(obj2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            tn.o.g0(PriceFetcherKt.extractProductIds(((HomePageV4.Section.HighlightedCarousel) it.next()).getReads()), arrayList2);
                        }
                        List<HomePageV4.Section> sections2 = ((HomePageV4) success.getData()).getSections();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : sections2) {
                            if (obj3 instanceof HomePageV4.Section.MediumCarousel) {
                                arrayList3.add(obj3);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            tn.o.g0(PriceFetcherKt.extractProductIds(((HomePageV4.Section.MediumCarousel) it2.next()).getReads()), arrayList4);
                        }
                        this.this$0.priceFetcher.fetchPrices(tn.o.O0(arrayList4, arrayList2));
                    } else {
                        c6.p();
                        return null;
                    }
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            final ir.i config = this.this$0.userConfigService.getConfig();
            ir.i iVar = new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$loadPage$1$1$invokeSuspend$$inlined$map$1

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$loadPage$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements ir.j {
                    final /* synthetic */ ir.j $this_unsafeFlow;

                    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$loadPage$1$1$invokeSuspend$$inlined$map$1$2", f = "HomeViewModelV4.kt", l = {50}, m = "emit", v = 2)
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4$loadPage$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends yn.c {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(wn.c cVar) {
                            super(cVar);
                        }

                        @Override // yn.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(ir.j jVar) {
                        this.$this_unsafeFlow = jVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                    @Override // ir.j
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, wn.c cVar) {
                        AnonymousClass1 anonymousClass1;
                        int i10;
                        if (cVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) cVar;
                            int i11 = anonymousClass1.label;
                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                i10 = anonymousClass1.label;
                                if (i10 == 0) {
                                    if (i10 == 1) {
                                        sn.a.g(obj2);
                                    } else {
                                        c6.x("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                } else {
                                    sn.a.g(obj2);
                                    ir.j jVar = this.$this_unsafeFlow;
                                    String storeCountryCode = ((UserConfig) obj).getStoreCountryCode();
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    Object emit = jVar.emit(storeCountryCode, anonymousClass1);
                                    xn.a aVar = xn.a.f37986a;
                                    if (emit == aVar) {
                                        return aVar;
                                    }
                                }
                                return z.f31622a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(cVar);
                        Object obj22 = anonymousClass1.result;
                        i10 = anonymousClass1.label;
                        if (i10 == 0) {
                        }
                        return z.f31622a;
                    }
                }

                @Override // ir.i
                public Object collect(ir.j jVar, wn.c cVar) {
                    Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                    if (collect == xn.a.f37986a) {
                        return collect;
                    }
                    return z.f31622a;
                }
            };
            this.label = 1;
            obj = ir.r.u(iVar, this);
        }
        homeService = this.this$0.homeService;
        this.L$0 = null;
        this.label = 2;
        obj = homeService.getHome((String) obj, this);
    }
}
