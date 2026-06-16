package io.elevenlabs.data.services;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import io.elevenlabs.data.api.ProductsAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.OneTimeProductV2;
import io.elevenlabs.data.model.SubscriptionProductV2;
import io.elevenlabs.data.model.response.OneTimeProductsPageResponseV2;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.MoneyPrice;
import io.elevenlabs.domain.model.OneTimeCreditsProduct;
import io.elevenlabs.domain.model.OneTimeProductsPage;
import io.elevenlabs.domain.model.RawOneTimeProduct;
import io.elevenlabs.domain.model.RawSubscriptionProduct;
import io.elevenlabs.domain.model.SubscriptionPeriod;
import io.elevenlabs.domain.model.SubscriptionProduct;
import io.elevenlabs.domain.services.ProductsService;
import io.elevenlabs.domain.services.PurchasesService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import tn.a0;
import tn.p;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00100\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00100\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010H\u0082@¢\u0006\u0004\b\u0018\u0010\u0015J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\"\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lio/elevenlabs/data/services/RestProductsService;", "Lio/elevenlabs/domain/services/ProductsService;", "Lio/elevenlabs/data/api/ProductsAPI;", "productsAPI", "Lio/elevenlabs/domain/services/PurchasesService;", "purchasesService", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/data/api/ProductsAPI;Lio/elevenlabs/domain/services/PurchasesService;Lio/elevenlabs/domain/Logger;)V", "Lio/elevenlabs/data/model/response/OneTimeProductsPageResponseV2;", "response", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/OneTimeProductsPage;", "processOneTimeProductsPage", "(Lio/elevenlabs/data/model/response/OneTimeProductsPageResponseV2;Lwn/c;)Ljava/lang/Object;", "", "Lio/elevenlabs/data/model/OneTimeProductV2;", "products", "Lio/elevenlabs/domain/model/OneTimeCreditsProduct;", "joinOneTimeProducts", "(Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/SubscriptionProductV2;", "Lio/elevenlabs/domain/model/SubscriptionProduct;", "joinSubscriptionProducts", "", "context", "getOneTimeCreditsProductsPage", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "getLowHoursPage", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/api/ProductsAPI;", "Lio/elevenlabs/domain/services/PurchasesService;", "Lio/elevenlabs/domain/Logger;", ParameterNames.TAG, "Ljava/lang/String;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RestProductsService implements ProductsService {
    private final Logger logger;
    private final ProductsAPI productsAPI;
    private final PurchasesService purchasesService;
    private final String tag;

    public RestProductsService(ProductsAPI productsAPI, PurchasesService purchasesService, Logger logger) {
        productsAPI.getClass();
        purchasesService.getClass();
        logger.getClass();
        this.productsAPI = productsAPI;
        this.purchasesService = purchasesService;
        this.logger = logger;
        this.tag = "ProductsService";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object joinOneTimeProducts(List<OneTimeProductV2> list, wn.c<? super AsyncCallResult<List<OneTimeCreditsProduct>>> cVar) {
        RestProductsService$joinOneTimeProducts$1 restProductsService$joinOneTimeProducts$1;
        int i10;
        AsyncCallResult asyncCallResult;
        OneTimeCreditsProduct oneTimeCreditsProduct;
        if (cVar instanceof RestProductsService$joinOneTimeProducts$1) {
            restProductsService$joinOneTimeProducts$1 = (RestProductsService$joinOneTimeProducts$1) cVar;
            int i11 = restProductsService$joinOneTimeProducts$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                restProductsService$joinOneTimeProducts$1.label = i11 - Integer.MIN_VALUE;
                Object obj = restProductsService$joinOneTimeProducts$1.result;
                i10 = restProductsService$joinOneTimeProducts$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        list = (List) restProductsService$joinOneTimeProducts$1.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    PurchasesService purchasesService = this.purchasesService;
                    ArrayList arrayList = new ArrayList(p.a0(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((OneTimeProductV2) it.next()).getId());
                    }
                    restProductsService$joinOneTimeProducts$1.L$0 = list;
                    restProductsService$joinOneTimeProducts$1.label = 1;
                    obj = purchasesService.getProducts(arrayList, restProductsService$joinOneTimeProducts$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                asyncCallResult = (AsyncCallResult) obj;
                if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                    return ((AsyncCallResult.Error) asyncCallResult).cast();
                }
                if (asyncCallResult instanceof AsyncCallResult.Success) {
                    List<RawOneTimeProduct> list2 = (List) ((AsyncCallResult.Success) asyncCallResult).getData();
                    int H = a0.H(p.a0(list2, 10));
                    if (H < 16) {
                        H = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(H);
                    for (RawOneTimeProduct rawOneTimeProduct : list2) {
                        linkedHashMap.put(rawOneTimeProduct.getId(), rawOneTimeProduct.getPrice());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (OneTimeProductV2 oneTimeProductV2 : list) {
                        MoneyPrice moneyPrice = (MoneyPrice) linkedHashMap.get(oneTimeProductV2.getId());
                        if (moneyPrice == null) {
                            oneTimeCreditsProduct = null;
                        } else {
                            oneTimeCreditsProduct = new OneTimeCreditsProduct(oneTimeProductV2.getId(), oneTimeProductV2.getTitle(), oneTimeProductV2.getDescription(), moneyPrice);
                        }
                        if (oneTimeCreditsProduct != null) {
                            arrayList2.add(oneTimeCreditsProduct);
                        }
                    }
                    return new AsyncCallResult.Success(arrayList2);
                }
                c6.p();
                return null;
            }
        }
        restProductsService$joinOneTimeProducts$1 = new RestProductsService$joinOneTimeProducts$1(this, cVar);
        Object obj2 = restProductsService$joinOneTimeProducts$1.result;
        i10 = restProductsService$joinOneTimeProducts$1.label;
        if (i10 == 0) {
        }
        asyncCallResult = (AsyncCallResult) obj2;
        if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object joinSubscriptionProducts(List<SubscriptionProductV2> list, wn.c<? super AsyncCallResult<List<SubscriptionProduct>>> cVar) {
        RestProductsService$joinSubscriptionProducts$1 restProductsService$joinSubscriptionProducts$1;
        int i10;
        AsyncCallResult asyncCallResult;
        SubscriptionPeriod subscriptionPeriod;
        MoneyPrice pricePerYear;
        List<SubscriptionProductV2> list2 = list;
        if (cVar instanceof RestProductsService$joinSubscriptionProducts$1) {
            restProductsService$joinSubscriptionProducts$1 = (RestProductsService$joinSubscriptionProducts$1) cVar;
            int i11 = restProductsService$joinSubscriptionProducts$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                restProductsService$joinSubscriptionProducts$1.label = i11 - Integer.MIN_VALUE;
                Object obj = restProductsService$joinSubscriptionProducts$1.result;
                i10 = restProductsService$joinSubscriptionProducts$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        list2 = (List) restProductsService$joinSubscriptionProducts$1.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    PurchasesService purchasesService = this.purchasesService;
                    ArrayList arrayList = new ArrayList(p.a0(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((SubscriptionProductV2) it.next()).getId());
                    }
                    restProductsService$joinSubscriptionProducts$1.L$0 = list2;
                    restProductsService$joinSubscriptionProducts$1.label = 1;
                    obj = purchasesService.getSubscriptionProducts(arrayList, restProductsService$joinSubscriptionProducts$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                asyncCallResult = (AsyncCallResult) obj;
                if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                    return ((AsyncCallResult.Error) asyncCallResult).cast();
                }
                if (asyncCallResult instanceof AsyncCallResult.Success) {
                    List<RawSubscriptionProduct> list3 = (List) ((AsyncCallResult.Success) asyncCallResult).getData();
                    int H = a0.H(p.a0(list3, 10));
                    if (H < 16) {
                        H = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(H);
                    for (RawSubscriptionProduct rawSubscriptionProduct : list3) {
                        linkedHashMap.put(rawSubscriptionProduct.getId(), rawSubscriptionProduct);
                    }
                    if (linkedHashMap.isEmpty()) {
                        this.logger.log(this.tag, "Can't load products - empty products list");
                        return new AsyncCallResult.Success(t.f33547a);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (SubscriptionProductV2 subscriptionProductV2 : list2) {
                        RawSubscriptionProduct rawSubscriptionProduct2 = (RawSubscriptionProduct) linkedHashMap.get(subscriptionProductV2.getId());
                        SubscriptionProduct subscriptionProduct = null;
                        if (rawSubscriptionProduct2 != null) {
                            String billingPeriod = subscriptionProductV2.getBillingPeriod();
                            if (m.c(billingPeriod, "monthly")) {
                                subscriptionPeriod = SubscriptionPeriod.MONTHLY;
                            } else if (m.c(billingPeriod, "annual")) {
                                subscriptionPeriod = SubscriptionPeriod.ANNUAL;
                            }
                            SubscriptionPeriod subscriptionPeriod2 = subscriptionPeriod;
                            String id2 = subscriptionProductV2.getId();
                            String title = subscriptionProductV2.getTitle();
                            String description = subscriptionProductV2.getDescription();
                            String badgeText = subscriptionProductV2.getBadgeText();
                            MoneyPrice pricePerMonth = rawSubscriptionProduct2.getPricePerMonth();
                            if (pricePerMonth != null && (pricePerYear = rawSubscriptionProduct2.getPricePerYear()) != null) {
                                subscriptionProduct = new SubscriptionProduct(id2, title, description, badgeText, subscriptionPeriod2, pricePerMonth, pricePerYear, rawSubscriptionProduct2.getFreeTrialDuration());
                            }
                        }
                        if (subscriptionProduct != null) {
                            arrayList2.add(subscriptionProduct);
                        }
                    }
                    return new AsyncCallResult.Success(arrayList2);
                }
                c6.p();
                return null;
            }
        }
        restProductsService$joinSubscriptionProducts$1 = new RestProductsService$joinSubscriptionProducts$1(this, cVar);
        Object obj2 = restProductsService$joinSubscriptionProducts$1.result;
        i10 = restProductsService$joinSubscriptionProducts$1.label;
        if (i10 == 0) {
        }
        asyncCallResult = (AsyncCallResult) obj2;
        if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0051, code lost:
    
        if (r14 == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processOneTimeProductsPage(OneTimeProductsPageResponseV2 oneTimeProductsPageResponseV2, wn.c<? super AsyncCallResult<OneTimeProductsPage>> cVar) {
        RestProductsService$processOneTimeProductsPage$1 restProductsService$processOneTimeProductsPage$1;
        int i10;
        AsyncCallResult asyncCallResult;
        List list;
        OneTimeProductsPageResponseV2 oneTimeProductsPageResponseV22;
        AsyncCallResult asyncCallResult2;
        if (cVar instanceof RestProductsService$processOneTimeProductsPage$1) {
            restProductsService$processOneTimeProductsPage$1 = (RestProductsService$processOneTimeProductsPage$1) cVar;
            int i11 = restProductsService$processOneTimeProductsPage$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                restProductsService$processOneTimeProductsPage$1.label = i11 - Integer.MIN_VALUE;
                Object obj = restProductsService$processOneTimeProductsPage$1.result;
                i10 = restProductsService$processOneTimeProductsPage$1.label;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            List list2 = (List) restProductsService$processOneTimeProductsPage$1.L$1;
                            oneTimeProductsPageResponseV22 = (OneTimeProductsPageResponseV2) restProductsService$processOneTimeProductsPage$1.L$0;
                            sn.a.g(obj);
                            list = list2;
                            asyncCallResult2 = (AsyncCallResult) obj;
                            if (!(asyncCallResult2 instanceof AsyncCallResult.Error)) {
                                return ((AsyncCallResult.Error) asyncCallResult2).cast();
                            }
                            if (asyncCallResult2 instanceof AsyncCallResult.Success) {
                                return new AsyncCallResult.Success(new OneTimeProductsPage(oneTimeProductsPageResponseV22.getCurrentMinutes(), list, (List) ((AsyncCallResult.Success) asyncCallResult2).getData(), oneTimeProductsPageResponseV22.getTitle(), oneTimeProductsPageResponseV22.getSubtitle()));
                            }
                            c6.p();
                            return null;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oneTimeProductsPageResponseV2 = (OneTimeProductsPageResponseV2) restProductsService$processOneTimeProductsPage$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    List<OneTimeProductV2> oneTimeProducts = oneTimeProductsPageResponseV2.getOneTimeProducts();
                    restProductsService$processOneTimeProductsPage$1.L$0 = oneTimeProductsPageResponseV2;
                    restProductsService$processOneTimeProductsPage$1.label = 1;
                    obj = joinOneTimeProducts(oneTimeProducts, restProductsService$processOneTimeProductsPage$1);
                }
                asyncCallResult = (AsyncCallResult) obj;
                if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                    return ((AsyncCallResult.Error) asyncCallResult).cast();
                }
                if (asyncCallResult instanceof AsyncCallResult.Success) {
                    List list3 = (List) ((AsyncCallResult.Success) asyncCallResult).getData();
                    List<SubscriptionProductV2> subscriptionProducts = oneTimeProductsPageResponseV2.getSubscriptionProducts();
                    restProductsService$processOneTimeProductsPage$1.L$0 = oneTimeProductsPageResponseV2;
                    restProductsService$processOneTimeProductsPage$1.L$1 = list3;
                    restProductsService$processOneTimeProductsPage$1.label = 2;
                    Object joinSubscriptionProducts = joinSubscriptionProducts(subscriptionProducts, restProductsService$processOneTimeProductsPage$1);
                    if (joinSubscriptionProducts != obj2) {
                        list = list3;
                        obj = joinSubscriptionProducts;
                        oneTimeProductsPageResponseV22 = oneTimeProductsPageResponseV2;
                        asyncCallResult2 = (AsyncCallResult) obj;
                        if (!(asyncCallResult2 instanceof AsyncCallResult.Error)) {
                        }
                    }
                    return obj2;
                }
                c6.p();
                return null;
            }
        }
        restProductsService$processOneTimeProductsPage$1 = new RestProductsService$processOneTimeProductsPage$1(this, cVar);
        Object obj3 = restProductsService$processOneTimeProductsPage$1.result;
        i10 = restProductsService$processOneTimeProductsPage$1.label;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        asyncCallResult = (AsyncCallResult) obj3;
        if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        if (r7 == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.elevenlabs.domain.services.ProductsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getLowHoursPage(wn.c<? super AsyncCallResult<OneTimeProductsPage>> cVar) {
        RestProductsService$getLowHoursPage$1 restProductsService$getLowHoursPage$1;
        int i10;
        AsyncCallResult domain;
        if (cVar instanceof RestProductsService$getLowHoursPage$1) {
            restProductsService$getLowHoursPage$1 = (RestProductsService$getLowHoursPage$1) cVar;
            int i11 = restProductsService$getLowHoursPage$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                restProductsService$getLowHoursPage$1.label = i11 - Integer.MIN_VALUE;
                Object obj = restProductsService$getLowHoursPage$1.result;
                i10 = restProductsService$getLowHoursPage$1.label;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return obj;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    ProductsAPI productsAPI = this.productsAPI;
                    restProductsService$getLowHoursPage$1.label = 1;
                    obj = ProductsAPI.getLowHoursProductsPage$default(productsAPI, null, restProductsService$getLowHoursPage$1, 1, null);
                }
                domain = ApiResultExtensionKt.toDomain((ApiResult) obj);
                if (!(domain instanceof AsyncCallResult.Error)) {
                    return ((AsyncCallResult.Error) domain).cast();
                }
                if (domain instanceof AsyncCallResult.Success) {
                    OneTimeProductsPageResponseV2 oneTimeProductsPageResponseV2 = (OneTimeProductsPageResponseV2) ((AsyncCallResult.Success) domain).getData();
                    restProductsService$getLowHoursPage$1.L$0 = null;
                    restProductsService$getLowHoursPage$1.label = 2;
                    Object processOneTimeProductsPage = processOneTimeProductsPage(oneTimeProductsPageResponseV2, restProductsService$getLowHoursPage$1);
                    if (processOneTimeProductsPage == obj2) {
                        return obj2;
                    }
                    return processOneTimeProductsPage;
                }
                c6.p();
                return null;
            }
        }
        restProductsService$getLowHoursPage$1 = new RestProductsService$getLowHoursPage$1(this, cVar);
        Object obj3 = restProductsService$getLowHoursPage$1.result;
        i10 = restProductsService$getLowHoursPage$1.label;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        domain = ApiResultExtensionKt.toDomain((ApiResult) obj3);
        if (!(domain instanceof AsyncCallResult.Error)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        if (r12 == r9) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // io.elevenlabs.domain.services.ProductsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getOneTimeCreditsProductsPage(String str, wn.c<? super AsyncCallResult<OneTimeProductsPage>> cVar) {
        RestProductsService$getOneTimeCreditsProductsPage$1 restProductsService$getOneTimeCreditsProductsPage$1;
        int i10;
        AsyncCallResult domain;
        if (cVar instanceof RestProductsService$getOneTimeCreditsProductsPage$1) {
            restProductsService$getOneTimeCreditsProductsPage$1 = (RestProductsService$getOneTimeCreditsProductsPage$1) cVar;
            int i11 = restProductsService$getOneTimeCreditsProductsPage$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                restProductsService$getOneTimeCreditsProductsPage$1.label = i11 - Integer.MIN_VALUE;
                RestProductsService$getOneTimeCreditsProductsPage$1 restProductsService$getOneTimeCreditsProductsPage$12 = restProductsService$getOneTimeCreditsProductsPage$1;
                Object obj = restProductsService$getOneTimeCreditsProductsPage$12.result;
                i10 = restProductsService$getOneTimeCreditsProductsPage$12.label;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return obj;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    ProductsAPI productsAPI = this.productsAPI;
                    restProductsService$getOneTimeCreditsProductsPage$12.L$0 = null;
                    restProductsService$getOneTimeCreditsProductsPage$12.label = 1;
                    obj = ProductsAPI.getOneTimeProductsPage$default(productsAPI, null, str, restProductsService$getOneTimeCreditsProductsPage$12, 1, null);
                }
                domain = ApiResultExtensionKt.toDomain((ApiResult) obj);
                if (!(domain instanceof AsyncCallResult.Error)) {
                    return ((AsyncCallResult.Error) domain).cast();
                }
                if (domain instanceof AsyncCallResult.Success) {
                    OneTimeProductsPageResponseV2 oneTimeProductsPageResponseV2 = (OneTimeProductsPageResponseV2) ((AsyncCallResult.Success) domain).getData();
                    restProductsService$getOneTimeCreditsProductsPage$12.L$0 = null;
                    restProductsService$getOneTimeCreditsProductsPage$12.L$1 = null;
                    restProductsService$getOneTimeCreditsProductsPage$12.label = 2;
                    Object processOneTimeProductsPage = processOneTimeProductsPage(oneTimeProductsPageResponseV2, restProductsService$getOneTimeCreditsProductsPage$12);
                    if (processOneTimeProductsPage == obj2) {
                        return obj2;
                    }
                    return processOneTimeProductsPage;
                }
                c6.p();
                return null;
            }
        }
        restProductsService$getOneTimeCreditsProductsPage$1 = new RestProductsService$getOneTimeCreditsProductsPage$1(this, cVar);
        RestProductsService$getOneTimeCreditsProductsPage$1 restProductsService$getOneTimeCreditsProductsPage$122 = restProductsService$getOneTimeCreditsProductsPage$1;
        Object obj3 = restProductsService$getOneTimeCreditsProductsPage$122.result;
        i10 = restProductsService$getOneTimeCreditsProductsPage$122.label;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        domain = ApiResultExtensionKt.toDomain((ApiResult) obj3);
        if (!(domain instanceof AsyncCallResult.Error)) {
        }
    }
}
