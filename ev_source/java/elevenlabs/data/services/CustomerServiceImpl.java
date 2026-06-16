package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import io.elevenlabs.data.api.CustomerAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.extensions.SharedPreferencesExtensionsKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.BookPurchaseHistoryItem;
import io.elevenlabs.data.model.request.ReadRefundRequest;
import io.elevenlabs.data.model.response.CustomerResponse;
import io.elevenlabs.data.model.response.GetCreditHistoryResponse;
import io.elevenlabs.data.model.response.GetCreditHistorySectionsResponse;
import io.elevenlabs.di.UserSharedPreferences;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.ActiveCreditPack;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.BookRefundReason;
import io.elevenlabs.domain.model.CreditHistory;
import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.domain.model.UsageSection;
import io.elevenlabs.domain.model.UsageSectionsPage;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.CustomerService;
import ir.a1;
import ir.r;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001=B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0017\u001a\u00020\u0019*\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u001aJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001f\u0010\u0010J \u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\"2\b\u0010!\u001a\u0004\u0018\u00010 H\u0096@¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001bH\u0016¢\u0006\u0004\b%\u0010\u001eJ\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bH\u0016¢\u0006\u0004\b&\u0010\u001eJ \u0010)\u001a\b\u0012\u0004\u0012\u00020(0\"2\b\u0010'\u001a\u0004\u0018\u00010 H\u0096@¢\u0006\u0004\b)\u0010$J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\"H\u0096@¢\u0006\u0004\b+\u0010\u0010J\u001c\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0\"H\u0096@¢\u0006\u0004\b.\u0010\u0010J0\u00103\u001a\b\u0012\u0004\u0012\u00020\u000e0\"2\u0006\u0010/\u001a\u00020 2\u0006\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u00010 H\u0096@¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0014\u0010:\u001a\u00020 8\u0002X\u0082D¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020 8\u0002X\u0082D¢\u0006\u0006\n\u0004\b<\u0010;¨\u0006>"}, d2 = {"Lio/elevenlabs/data/services/CustomerServiceImpl;", "Lio/elevenlabs/domain/services/CustomerService;", "Lio/elevenlabs/data/api/CustomerAPI;", "customerAPI", "Lvr/c;", "json", "Lio/elevenlabs/domain/Logger;", "logger", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lio/elevenlabs/domain/services/ConnectivityService;", "connectivityService", "<init>", "(Lio/elevenlabs/data/api/CustomerAPI;Lvr/c;Lio/elevenlabs/domain/Logger;Landroid/content/SharedPreferences;Lio/elevenlabs/domain/services/ConnectivityService;)V", "Lsn/z;", "syncOnce", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/response/CustomerResponse;", "result", "save", "(Lio/elevenlabs/data/model/response/CustomerResponse;)V", "Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section;", "Lio/elevenlabs/domain/model/UsageSection;", "toDomain", "(Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section;)Lio/elevenlabs/domain/model/UsageSection;", "Lio/elevenlabs/domain/model/Customer;", "(Lio/elevenlabs/data/model/response/CustomerResponse;)Lio/elevenlabs/domain/model/Customer;", "Lir/i;", "Lio/elevenlabs/domain/model/SyncStatus;", "sync", "()Lir/i;", "invalidateAndSync", "", "transactionId", "Lio/elevenlabs/domain/model/AsyncCallResult;", "refreshPurchase", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "getCustomerOrNull", "getCustomer", "lastSortId", "Lio/elevenlabs/domain/model/CreditHistory;", "getCreditHistory", "Lio/elevenlabs/domain/model/UsageSectionsPage;", "getCreditHistorySections", "", "Lio/elevenlabs/domain/model/BookPurchaseHistoryItem;", "getPurchaseHistory", "readId", "Lio/elevenlabs/domain/model/BookRefundReason;", "reason", "reasonOtherText", "postBookRefund", "(Ljava/lang/String;Lio/elevenlabs/domain/model/BookRefundReason;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/api/CustomerAPI;", "Lvr/c;", "Lio/elevenlabs/domain/Logger;", "Landroid/content/SharedPreferences;", "Lio/elevenlabs/domain/services/ConnectivityService;", ParameterNames.TAG, "Ljava/lang/String;", "prefConfig", "CustomerSyncException", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CustomerServiceImpl implements CustomerService {
    private final ConnectivityService connectivityService;
    private final CustomerAPI customerAPI;
    private final vr.c json;
    private final Logger logger;
    private final String prefConfig;
    private final SharedPreferences sharedPreferences;
    private final String tag;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/elevenlabs/data/services/CustomerServiceImpl$CustomerSyncException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class CustomerSyncException extends Exception {
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookRefundReason.values().length];
            try {
                iArr[BookRefundReason.NarratorDislike.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookRefundReason.PoorAudioQuality.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookRefundReason.ContentNotExpected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BookRefundReason.StoryNotEnjoyed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BookRefundReason.AccidentalPurchase.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BookRefundReason.AlreadyOwn.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BookRefundReason.WrongBook.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BookRefundReason.DifferentFormat.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BookRefundReason.WrongLanguage.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BookRefundReason.ChangedMind.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BookRefundReason.Other.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CustomerServiceImpl(CustomerAPI customerAPI, vr.c cVar, Logger logger, @UserSharedPreferences SharedPreferences sharedPreferences, ConnectivityService connectivityService) {
        customerAPI.getClass();
        cVar.getClass();
        logger.getClass();
        sharedPreferences.getClass();
        connectivityService.getClass();
        this.customerAPI = customerAPI;
        this.json = cVar;
        this.logger = logger;
        this.sharedPreferences = sharedPreferences;
        this.connectivityService = connectivityService;
        this.tag = "CustomerService";
        this.prefConfig = "CUSTOMER";
    }

    public static /* synthetic */ z a(CustomerResponse customerResponse) {
        return refreshPurchase$lambda$0(customerResponse);
    }

    public static /* synthetic */ CreditHistory b(GetCreditHistoryResponse getCreditHistoryResponse) {
        return getCreditHistory$lambda$0(getCreditHistoryResponse);
    }

    public static /* synthetic */ UsageSectionsPage c(CustomerServiceImpl customerServiceImpl, GetCreditHistorySectionsResponse getCreditHistorySectionsResponse) {
        return getCreditHistorySections$lambda$0(customerServiceImpl, getCreditHistorySectionsResponse);
    }

    public static /* synthetic */ List d(List list) {
        return getPurchaseHistory$lambda$0(list);
    }

    public static final CreditHistory getCreditHistory$lambda$0(GetCreditHistoryResponse getCreditHistoryResponse) {
        getCreditHistoryResponse.getClass();
        List<GetCreditHistoryResponse.Item> items = getCreditHistoryResponse.getItems();
        ArrayList arrayList = new ArrayList(p.a0(items, 10));
        for (GetCreditHistoryResponse.Item item : items) {
            Date date = null;
            if (item instanceof GetCreditHistoryResponse.Item.CreditHistoryItemResponse) {
                GetCreditHistoryResponse.Item.CreditHistoryItemResponse creditHistoryItemResponse = (GetCreditHistoryResponse.Item.CreditHistoryItemResponse) item;
                String title = creditHistoryItemResponse.getTitle();
                String badge = creditHistoryItemResponse.getBadge();
                Long hours = creditHistoryItemResponse.getHours();
                xq.a aVar = xq.b.f38124b;
                long dateUnix = creditHistoryItemResponse.getDateUnix();
                xq.d dVar = xq.d.SECONDS;
                Date date2 = new Date(xq.b.d(xq.g.o(dateUnix, dVar)));
                Long expirationDateUnix = creditHistoryItemResponse.getExpirationDateUnix();
                if (expirationDateUnix != null) {
                    date = new Date(xq.b.d(xq.g.o(expirationDateUnix.longValue(), dVar)));
                }
                arrayList.add(new CreditHistory.Item.CreditHistoryItemResponse(title, badge, hours, date2, date));
            } else {
                c6.p();
                return null;
            }
        }
        return new CreditHistory(arrayList, getCreditHistoryResponse.getHasMore(), getCreditHistoryResponse.getLastSortId());
    }

    public static final UsageSectionsPage getCreditHistorySections$lambda$0(CustomerServiceImpl customerServiceImpl, GetCreditHistorySectionsResponse getCreditHistorySectionsResponse) {
        getCreditHistorySectionsResponse.getClass();
        List<GetCreditHistorySectionsResponse.Section> sections = getCreditHistorySectionsResponse.getSections();
        ArrayList arrayList = new ArrayList(p.a0(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            arrayList.add(customerServiceImpl.toDomain((GetCreditHistorySectionsResponse.Section) it.next()));
        }
        return new UsageSectionsPage(arrayList);
    }

    public static final List getPurchaseHistory$lambda$0(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BookPurchaseHistoryItem bookPurchaseHistoryItem = (BookPurchaseHistoryItem) it.next();
            String title = bookPurchaseHistoryItem.getTitle();
            xq.a aVar = xq.b.f38124b;
            arrayList.add(new io.elevenlabs.domain.model.BookPurchaseHistoryItem(title, new Date(xq.b.d(xq.g.o(bookPurchaseHistoryItem.getDateUnix(), xq.d.SECONDS))), bookPurchaseHistoryItem.getPrice(), bookPurchaseHistoryItem.isRefundable(), bookPurchaseHistoryItem.getAuthor(), bookPurchaseHistoryItem.getReadId()));
        }
        return arrayList;
    }

    public static final z refreshPurchase$lambda$0(CustomerResponse customerResponse) {
        customerResponse.getClass();
        return z.f31622a;
    }

    private final void save(CustomerResponse result) {
        this.logger.log(this.tag, "Customer credits: " + result.getCurrentCredits().getValue().longValue());
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        String str = this.prefConfig;
        vr.c cVar = this.json;
        cVar.getClass();
        edit.putString(str, cVar.d(CustomerResponse.INSTANCE.serializer(), result));
        edit.apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncOnce(wn.c<? super z> cVar) {
        CustomerServiceImpl$syncOnce$1 customerServiceImpl$syncOnce$1;
        int i10;
        ApiResult apiResult;
        if (cVar instanceof CustomerServiceImpl$syncOnce$1) {
            customerServiceImpl$syncOnce$1 = (CustomerServiceImpl$syncOnce$1) cVar;
            int i11 = customerServiceImpl$syncOnce$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                customerServiceImpl$syncOnce$1.label = i11 - Integer.MIN_VALUE;
                Object obj = customerServiceImpl$syncOnce$1.result;
                i10 = customerServiceImpl$syncOnce$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    this.logger.log(this.tag, "Customer sync started");
                    CustomerAPI customerAPI = this.customerAPI;
                    customerServiceImpl$syncOnce$1.label = 1;
                    obj = customerAPI.getCustomerInfo(customerServiceImpl$syncOnce$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    save((CustomerResponse) ((ApiResult.Success) apiResult).getData());
                    this.logger.log(this.tag, "Customer sync completed successfully");
                    return z.f31622a;
                }
                if (!(apiResult instanceof ApiResult.Error)) {
                    c6.p();
                    return null;
                }
                Logger.logWarning$default(this.logger, this.tag, "Error during customer sync: " + apiResult, null, 4, null);
                throw new CustomerSyncException();
            }
        }
        customerServiceImpl$syncOnce$1 = new CustomerServiceImpl$syncOnce$1(this, cVar);
        Object obj2 = customerServiceImpl$syncOnce$1.result;
        i10 = customerServiceImpl$syncOnce$1.label;
        if (i10 == 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    private final UsageSection toDomain(GetCreditHistorySectionsResponse.Section section) {
        boolean z6 = section instanceof GetCreditHistorySectionsResponse.Section.UsageProgress;
        Date date = null;
        xq.d dVar = xq.d.SECONDS;
        if (z6) {
            GetCreditHistorySectionsResponse.Section.UsageProgress usageProgress = (GetCreditHistorySectionsResponse.Section.UsageProgress) section;
            String label = usageProgress.getLabel();
            String valueLabel = usageProgress.getValueLabel();
            int progressCurrent = usageProgress.getProgressCurrent();
            int progressTotal = usageProgress.getProgressTotal();
            boolean enabled = usageProgress.getEnabled();
            String infoTooltip = usageProgress.getInfoTooltip();
            Long resetsAtUnix = usageProgress.getResetsAtUnix();
            if (resetsAtUnix != null) {
                xq.a aVar = xq.b.f38124b;
                date = new Date(xq.b.d(xq.g.o(resetsAtUnix.longValue(), dVar)));
            }
            return new UsageSection.UsageProgress(label, valueLabel, progressCurrent, progressTotal, enabled, infoTooltip, date);
        }
        if (section instanceof GetCreditHistorySectionsResponse.Section.UsageExtraHours) {
            GetCreditHistorySectionsResponse.Section.UsageExtraHours usageExtraHours = (GetCreditHistorySectionsResponse.Section.UsageExtraHours) section;
            String label2 = usageExtraHours.getLabel();
            String valueLabel2 = usageExtraHours.getValueLabel();
            int progressCurrent2 = usageExtraHours.getProgressCurrent();
            int progressTotal2 = usageExtraHours.getProgressTotal();
            boolean enabled2 = usageExtraHours.getEnabled();
            String infoTooltip2 = usageExtraHours.getInfoTooltip();
            String packsSummaryLabel = usageExtraHours.getPacksSummaryLabel();
            List<GetCreditHistorySectionsResponse.ActiveCreditPack> packs = usageExtraHours.getPacks();
            ArrayList arrayList = new ArrayList(p.a0(packs, 10));
            for (GetCreditHistorySectionsResponse.ActiveCreditPack activeCreditPack : packs) {
                String label3 = activeCreditPack.getLabel();
                xq.a aVar2 = xq.b.f38124b;
                arrayList.add(new ActiveCreditPack(label3, new Date(xq.b.d(xq.g.o(activeCreditPack.getExpiresAtUnix(), dVar)))));
            }
            return new UsageSection.UsageExtraHours(label2, valueLabel2, progressCurrent2, progressTotal2, enabled2, infoTooltip2, packsSummaryLabel, arrayList);
        }
        c6.p();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // io.elevenlabs.domain.services.CustomerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getCreditHistory(String str, wn.c<? super AsyncCallResult<CreditHistory>> cVar) {
        CustomerServiceImpl$getCreditHistory$1 customerServiceImpl$getCreditHistory$1;
        int i10;
        if (cVar instanceof CustomerServiceImpl$getCreditHistory$1) {
            customerServiceImpl$getCreditHistory$1 = (CustomerServiceImpl$getCreditHistory$1) cVar;
            int i11 = customerServiceImpl$getCreditHistory$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                customerServiceImpl$getCreditHistory$1.label = i11 - Integer.MIN_VALUE;
                CustomerServiceImpl$getCreditHistory$1 customerServiceImpl$getCreditHistory$12 = customerServiceImpl$getCreditHistory$1;
                Object obj = customerServiceImpl$getCreditHistory$12.result;
                i10 = customerServiceImpl$getCreditHistory$12.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    CustomerAPI customerAPI = this.customerAPI;
                    customerServiceImpl$getCreditHistory$12.L$0 = null;
                    customerServiceImpl$getCreditHistory$12.label = 1;
                    obj = CustomerAPI.getCreditHistory$default(customerAPI, null, str, customerServiceImpl$getCreditHistory$12, 1, null);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new b(11));
            }
        }
        customerServiceImpl$getCreditHistory$1 = new CustomerServiceImpl$getCreditHistory$1(this, cVar);
        CustomerServiceImpl$getCreditHistory$1 customerServiceImpl$getCreditHistory$122 = customerServiceImpl$getCreditHistory$1;
        Object obj2 = customerServiceImpl$getCreditHistory$122.result;
        i10 = customerServiceImpl$getCreditHistory$122.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new b(11));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.CustomerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getCreditHistorySections(wn.c<? super AsyncCallResult<UsageSectionsPage>> cVar) {
        CustomerServiceImpl$getCreditHistorySections$1 customerServiceImpl$getCreditHistorySections$1;
        int i10;
        if (cVar instanceof CustomerServiceImpl$getCreditHistorySections$1) {
            customerServiceImpl$getCreditHistorySections$1 = (CustomerServiceImpl$getCreditHistorySections$1) cVar;
            int i11 = customerServiceImpl$getCreditHistorySections$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                customerServiceImpl$getCreditHistorySections$1.label = i11 - Integer.MIN_VALUE;
                Object obj = customerServiceImpl$getCreditHistorySections$1.result;
                i10 = customerServiceImpl$getCreditHistorySections$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    CustomerAPI customerAPI = this.customerAPI;
                    customerServiceImpl$getCreditHistorySections$1.label = 1;
                    obj = customerAPI.getCreditHistorySections(customerServiceImpl$getCreditHistorySections$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new a(this, 1));
            }
        }
        customerServiceImpl$getCreditHistorySections$1 = new CustomerServiceImpl$getCreditHistorySections$1(this, cVar);
        Object obj2 = customerServiceImpl$getCreditHistorySections$1.result;
        i10 = customerServiceImpl$getCreditHistorySections$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new a(this, 1));
    }

    @Override // io.elevenlabs.domain.services.CustomerService
    public ir.i getCustomer() {
        return new a1(getCustomerOrNull(), 0);
    }

    @Override // io.elevenlabs.domain.services.CustomerService
    public ir.i getCustomerOrNull() {
        return SharedPreferencesExtensionsKt.observe(this.sharedPreferences, this.prefConfig, new CustomerServiceImpl$getCustomerOrNull$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.CustomerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getPurchaseHistory(wn.c<? super AsyncCallResult<List<io.elevenlabs.domain.model.BookPurchaseHistoryItem>>> cVar) {
        CustomerServiceImpl$getPurchaseHistory$1 customerServiceImpl$getPurchaseHistory$1;
        int i10;
        if (cVar instanceof CustomerServiceImpl$getPurchaseHistory$1) {
            customerServiceImpl$getPurchaseHistory$1 = (CustomerServiceImpl$getPurchaseHistory$1) cVar;
            int i11 = customerServiceImpl$getPurchaseHistory$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                customerServiceImpl$getPurchaseHistory$1.label = i11 - Integer.MIN_VALUE;
                Object obj = customerServiceImpl$getPurchaseHistory$1.result;
                i10 = customerServiceImpl$getPurchaseHistory$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    CustomerAPI customerAPI = this.customerAPI;
                    customerServiceImpl$getPurchaseHistory$1.label = 1;
                    obj = customerAPI.getPurchaseHistory(customerServiceImpl$getPurchaseHistory$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new b(10));
            }
        }
        customerServiceImpl$getPurchaseHistory$1 = new CustomerServiceImpl$getPurchaseHistory$1(this, cVar);
        Object obj2 = customerServiceImpl$getPurchaseHistory$1.result;
        i10 = customerServiceImpl$getPurchaseHistory$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new b(10));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r4.logger.log(r4.tag, "invalidateAndSync: Failed to invalidate");
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // io.elevenlabs.domain.services.CustomerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invalidateAndSync(wn.c<? super z> cVar) {
        CustomerServiceImpl$invalidateAndSync$1 customerServiceImpl$invalidateAndSync$1;
        int i10;
        if (cVar instanceof CustomerServiceImpl$invalidateAndSync$1) {
            customerServiceImpl$invalidateAndSync$1 = (CustomerServiceImpl$invalidateAndSync$1) cVar;
            int i11 = customerServiceImpl$invalidateAndSync$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                customerServiceImpl$invalidateAndSync$1.label = i11 - Integer.MIN_VALUE;
                Object obj = customerServiceImpl$invalidateAndSync$1.result;
                i10 = customerServiceImpl$invalidateAndSync$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    SharedPreferences.Editor edit = this.sharedPreferences.edit();
                    edit.remove(this.prefConfig);
                    edit.apply();
                    this.logger.log(this.tag, "invalidateAndSync: Customer cache invalidated");
                    customerServiceImpl$invalidateAndSync$1.label = 1;
                    Object syncOnce = syncOnce(customerServiceImpl$invalidateAndSync$1);
                    Object obj2 = xn.a.f37986a;
                    if (syncOnce == obj2) {
                        return obj2;
                    }
                }
                return z.f31622a;
            }
        }
        customerServiceImpl$invalidateAndSync$1 = new CustomerServiceImpl$invalidateAndSync$1(this, cVar);
        Object obj3 = customerServiceImpl$invalidateAndSync$1.result;
        i10 = customerServiceImpl$invalidateAndSync$1.label;
        if (i10 == 0) {
        }
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.CustomerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object postBookRefund(String str, BookRefundReason bookRefundReason, String str2, wn.c<? super AsyncCallResult<z>> cVar) {
        CustomerServiceImpl$postBookRefund$1 customerServiceImpl$postBookRefund$1;
        int i10;
        String str3;
        if (cVar instanceof CustomerServiceImpl$postBookRefund$1) {
            customerServiceImpl$postBookRefund$1 = (CustomerServiceImpl$postBookRefund$1) cVar;
            int i11 = customerServiceImpl$postBookRefund$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                customerServiceImpl$postBookRefund$1.label = i11 - Integer.MIN_VALUE;
                Object obj = customerServiceImpl$postBookRefund$1.result;
                i10 = customerServiceImpl$postBookRefund$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    switch (WhenMappings.$EnumSwitchMapping$0[bookRefundReason.ordinal()]) {
                        case 1:
                            str3 = "narrator_dislike";
                            break;
                        case 2:
                            str3 = "poor_audio_quality";
                            break;
                        case 3:
                            str3 = "content_not_expected";
                            break;
                        case 4:
                            str3 = "story_not_enjoyed";
                            break;
                        case 5:
                            str3 = "accidental_purchase";
                            break;
                        case 6:
                            str3 = "already_own";
                            break;
                        case 7:
                            str3 = "wrong_book";
                            break;
                        case 8:
                            str3 = "different_format";
                            break;
                        case 9:
                            str3 = "wrong_language";
                            break;
                        case 10:
                            str3 = "changed_mind";
                            break;
                        case 11:
                            str3 = "other";
                            break;
                        default:
                            c6.p();
                            return null;
                    }
                    CustomerAPI customerAPI = this.customerAPI;
                    ReadRefundRequest readRefundRequest = new ReadRefundRequest(str, str3, str2);
                    customerServiceImpl$postBookRefund$1.L$0 = null;
                    customerServiceImpl$postBookRefund$1.L$1 = null;
                    customerServiceImpl$postBookRefund$1.L$2 = null;
                    customerServiceImpl$postBookRefund$1.L$3 = null;
                    customerServiceImpl$postBookRefund$1.label = 1;
                    obj = customerAPI.postRefundRead(readRefundRequest, customerServiceImpl$postBookRefund$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.toDomain((ApiResult) obj);
            }
        }
        customerServiceImpl$postBookRefund$1 = new CustomerServiceImpl$postBookRefund$1(this, cVar);
        Object obj2 = customerServiceImpl$postBookRefund$1.result;
        i10 = customerServiceImpl$postBookRefund$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.toDomain((ApiResult) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.CustomerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object refreshPurchase(String str, wn.c<? super AsyncCallResult<z>> cVar) {
        CustomerServiceImpl$refreshPurchase$1 customerServiceImpl$refreshPurchase$1;
        int i10;
        AsyncCallResult domain;
        if (cVar instanceof CustomerServiceImpl$refreshPurchase$1) {
            customerServiceImpl$refreshPurchase$1 = (CustomerServiceImpl$refreshPurchase$1) cVar;
            int i11 = customerServiceImpl$refreshPurchase$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                customerServiceImpl$refreshPurchase$1.label = i11 - Integer.MIN_VALUE;
                Object obj = customerServiceImpl$refreshPurchase$1.result;
                i10 = customerServiceImpl$refreshPurchase$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ib.i.r("refreshPurchase - transactionId=", str, this.logger, this.tag);
                    CustomerAPI customerAPI = this.customerAPI;
                    customerServiceImpl$refreshPurchase$1.L$0 = null;
                    customerServiceImpl$refreshPurchase$1.label = 1;
                    obj = customerAPI.refreshPurchase(str, customerServiceImpl$refreshPurchase$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                domain = ApiResultExtensionKt.toDomain((ApiResult) obj);
                if (!(domain instanceof AsyncCallResult.Success)) {
                    AsyncCallResult.Success success = (AsyncCallResult.Success) domain;
                    save((CustomerResponse) success.getData());
                    ib.i.r("refreshPurchase succeeded - plan=", ((CustomerResponse) success.getData()).getPlan(), this.logger, this.tag);
                } else {
                    Logger.logWarning$default(this.logger, this.tag, "refreshPurchase failed: " + domain, null, 4, null);
                }
                return ApiResultExtensionKt.map(domain, new b(9));
            }
        }
        customerServiceImpl$refreshPurchase$1 = new CustomerServiceImpl$refreshPurchase$1(this, cVar);
        Object obj2 = customerServiceImpl$refreshPurchase$1.result;
        i10 = customerServiceImpl$refreshPurchase$1.label;
        if (i10 == 0) {
        }
        domain = ApiResultExtensionKt.toDomain((ApiResult) obj2);
        if (!(domain instanceof AsyncCallResult.Success)) {
        }
        return ApiResultExtensionKt.map(domain, new b(9));
    }

    @Override // io.elevenlabs.domain.services.CustomerService
    public ir.i sync() {
        return r.j(new CustomerServiceImpl$sync$1(this, null));
    }

    public final Customer toDomain(CustomerResponse customerResponse) {
        String id2 = customerResponse.getId();
        String plan = customerResponse.getPlan();
        String billingPeriod = customerResponse.getBillingPeriod();
        long longValue = customerResponse.getCurrentCredits().getValue().longValue();
        Long nextCreditDateUnix = customerResponse.getNextCreditDateUnix();
        Date date = nextCreditDateUnix != null ? new Date(nextCreditDateUnix.longValue()) : null;
        boolean canUpgrade = customerResponse.getCanUpgrade();
        boolean canTrial = customerResponse.getCanTrial();
        Boolean isWinBackEligible = customerResponse.isWinBackEligible();
        return new Customer(id2, plan, billingPeriod, longValue, canUpgrade, canTrial, isWinBackEligible != null ? isWinBackEligible.booleanValue() : false, m.c(customerResponse.getPlan(), "free"), date);
    }
}
