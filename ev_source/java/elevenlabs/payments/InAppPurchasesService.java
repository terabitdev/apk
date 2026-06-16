package io.elevenlabs.payments;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.zzbw;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import com.revenuecat.purchases.CoroutinesExtensionsCommonKt;
import com.revenuecat.purchases.CoroutinesExtensionsKt;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.PurchaseResult;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.PurchasesTransactionException;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import com.revenuecat.purchases.customercenter.CustomerCenterManagementOption;
import com.revenuecat.purchases.customercenter.Resumable;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import defpackage.f;
import fr.d0;
import fr.g0;
import fr.j2;
import fr.l;
import fr.n;
import fr.u;
import ho.q;
import i4.o1;
import ib.i;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.ApplicationCoroutineScope;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.domain.model.FreeTrialDuration;
import io.elevenlabs.domain.model.MoneyPrice;
import io.elevenlabs.domain.model.RawOneTimeProduct;
import io.elevenlabs.domain.model.RawSubscriptionProduct;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.PurchasesService;
import ir.b2;
import ir.i1;
import ir.j;
import ir.j1;
import ir.k1;
import ir.n1;
import ir.q1;
import ir.r;
import ir.z1;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import jd.d;
import jd.t;
import jd.v;
import jd.x;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.a0;
import tn.o;
import tn.p;
import wn.c;
import xq.g;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001~Be\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001e0\u00152\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u001eH\u0096@¢\u0006\u0004\b \u0010!J*\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001e0\u00152\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u001eH\u0096@¢\u0006\u0004\b#\u0010!J&\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010%\u001a\u00020$H\u0096@¢\u0006\u0004\b'\u0010(J.\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00152\u0006\u0010)\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010%\u001a\u00020$H\u0096@¢\u0006\u0004\b+\u0010,J.\u0010/\u001a\b\u0012\u0004\u0012\u00020&0\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010%\u001a\u00020$2\u0006\u0010.\u001a\u00020-H\u0096@¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b1\u0010\u0018J\u000f\u00102\u001a\u00020\u0016H\u0002¢\u0006\u0004\b2\u00103J\u0013\u00106\u001a\u000205*\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0094\u0001\u0010E\u001a\u00028\u0000\"\u0004\b\u0000\u001082 \b\u0002\u0010;\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001609\u0012\u0004\u0012\u00020:092\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<2\u0016\u0010@\u001a\u0012\u0012\b\u0012\u00060>j\u0002`?\u0012\u0004\u0012\u00028\u00000924\u0010D\u001a0\b\u0001\u0012\u0004\u0012\u00020B\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001609\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160C\u0012\u0006\u0012\u0004\u0018\u00010$0AH\u0082@¢\u0006\u0004\bE\u0010FJF\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u001082(\u0010D\u001a$\b\u0001\u0012\u0004\u0012\u00020B\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150C\u0012\u0006\u0012\u0004\u0018\u00010$0GH\u0082@¢\u0006\u0004\bE\u0010HJ\"\u0010K\u001a\u0004\u0018\u00010J2\u0006\u0010I\u001a\u00020B2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020*2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ6\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010)\u001a\u00020\u00192\u0006\u0010Q\u001a\u00020\u00192\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020RH\u0082@¢\u0006\u0004\bU\u0010VJ\u0014\u0010X\u001a\u00020-*\u00020BH\u0082@¢\u0006\u0004\bX\u0010YJ\u0016\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0082@¢\u0006\u0004\bZ\u0010\u0018J\u001e\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\\\u001a\u00020[H\u0082@¢\u0006\u0004\b]\u0010^J\u0018\u0010_\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b_\u0010`R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010aR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010aR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010aR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010aR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010cR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010dR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010eR\u0014\u0010f\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010i\u001a\u00020h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020-0k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR \u0010o\u001a\b\u0012\u0004\u0012\u00020-0n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bo\u0010qR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020s0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR \u0010w\u001a\b\u0012\u0004\u0012\u00020s0v8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u0016\u0010{\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010}\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010|¨\u0006\u007f"}, d2 = {"Lio/elevenlabs/payments/InAppPurchasesService;", "Lio/elevenlabs/domain/services/PurchasesService;", "Ljl/a;", "Lcom/revenuecat/purchases/Purchases;", "purchases", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "Lio/elevenlabs/domain/services/GooglePlayService;", "googlePlayService", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Logger;", "logger", "Lfr/d0;", "coroutineScope", "Landroid/content/Context;", "context", "<init>", "(Ljl/a;Ljl/a;Ljl/a;Ljl/a;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Logger;Lfr/d0;Landroid/content/Context;)V", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lsn/z;", "restorePurchases", "(Lwn/c;)Ljava/lang/Object;", "", "productId", "Lio/elevenlabs/domain/model/RawOneTimeProduct;", "getGooglePlayProduct", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "", "productIds", "getProducts", "(Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/RawSubscriptionProduct;", "getSubscriptionProducts", "", "activity", "Lio/elevenlabs/domain/services/PurchasesService$PurchaseResult;", FirebaseAnalytics.Event.PURCHASE, "(Ljava/lang/String;Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "readId", "Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult;", "purchaseRead", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "", "withFreeTrial", "subscribe", "(Ljava/lang/String;Ljava/lang/Object;ZLwn/c;)Ljava/lang/Object;", "ensureAuthenticated", "updateTrialEligibility", "()V", "Lcom/revenuecat/purchases/models/Price;", "Lio/elevenlabs/domain/model/MoneyPrice;", "toMoneyPrice", "(Lcom/revenuecat/purchases/models/Price;)Lio/elevenlabs/domain/model/MoneyPrice;", TokenNames.T, "Lkotlin/Function1;", "Ljd/x;", "listenerFactory", "Lkotlin/Function0;", "onConnectionFailed", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onOperationFailed", "Lkotlin/Function3;", "Ljd/b;", "Lwn/c;", "operation", "withBillingClient", "(Lho/l;Lho/a;Lho/l;Lho/q;Lwn/c;)Ljava/lang/Object;", "Lkotlin/Function2;", "(Lho/p;Lwn/c;)Ljava/lang/Object;", "billingClient", "Ljd/t;", "queryProductDetails", "(Ljd/b;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "", "responseCode", "mapBillingResponseToReadPurchaseResult", "(I)Lio/elevenlabs/domain/services/PurchasesService$ReadPurchaseResult;", "purchaseToken", "Lxq/b;", "timeout", "pollInterval", "pollForPurchaseConfirmation-ck1zr5g", "(Ljava/lang/String;Ljava/lang/String;JJLwn/c;)Ljava/lang/Object;", "pollForPurchaseConfirmation", "awaitConnection", "(Ljd/b;Lwn/c;)Ljava/lang/Object;", "auth", "Lio/elevenlabs/domain/model/Customer;", "customer", "authCustomer", "(Lio/elevenlabs/domain/model/Customer;Lwn/c;)Ljava/lang/Object;", "setFirebaseAppInstanceID", "(Lcom/revenuecat/purchases/Purchases;Lwn/c;)Ljava/lang/Object;", "Ljl/a;", "Lio/elevenlabs/domain/DispatcherFactory;", "Lio/elevenlabs/domain/Logger;", "Lfr/d0;", "Landroid/content/Context;", ParameterNames.TAG, "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isAuthorized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lir/j1;", "_isEligibleForTrial", "Lir/j1;", "Lir/z1;", "isEligibleForTrial", "Lir/z1;", "()Lir/z1;", "Lir/i1;", "Lio/elevenlabs/domain/services/PurchasesService$CustomerCenterEvent;", "_customerCenterEvents", "Lir/i1;", "Lir/n1;", "customerCenterEvents", "Lir/n1;", "getCustomerCenterEvents", "()Lir/n1;", "rcEligibleForTrial", "Z", "customerCanTrial", "BillingClientResult", "payments_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class InAppPurchasesService implements PurchasesService {
    private final i1 _customerCenterEvents;
    private final j1 _isEligibleForTrial;
    private final jl.a analytics;
    private final Context context;
    private final d0 coroutineScope;
    private volatile boolean customerCanTrial;
    private final n1 customerCenterEvents;
    private final jl.a customerService;
    private final DispatcherFactory dispatcherFactory;
    private final jl.a googlePlayService;
    private AtomicBoolean isAuthorized;
    private final z1 isEligibleForTrial;
    private final Logger logger;
    private final jl.a purchases;
    private volatile boolean rcEligibleForTrial;
    private final String tag;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"io/elevenlabs/payments/InAppPurchasesService$2", "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "Lcom/revenuecat/purchases/customercenter/Resumable;", "resume", "Lsn/z;", "onRestoreInitiated", "(Lcom/revenuecat/purchases/customercenter/Resumable;)V", "onRestoreStarted", "()V", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "onRestoreCompleted", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "Lcom/revenuecat/purchases/PurchasesError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onRestoreFailed", "(Lcom/revenuecat/purchases/PurchasesError;)V", "onShowingManageSubscriptions", "", "feedbackSurveyOptionId", "onFeedbackSurveyCompleted", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption;", "action", "onManagementOptionSelected", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption;)V", "actionIdentifier", "purchaseIdentifier", "onCustomActionSelected", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "transaction", "onPromotionalOfferSucceeded", "(Lcom/revenuecat/purchases/CustomerInfo;Lcom/revenuecat/purchases/models/StoreTransaction;)V", "payments_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.payments.InAppPurchasesService$2 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 implements CustomerCenterListener {
        public AnonymousClass2() {
        }

        @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
        public void onCustomActionSelected(String actionIdentifier, String purchaseIdentifier) {
            actionIdentifier.getClass();
            InAppPurchasesService.this.logger.log(InAppPurchasesService.this.tag, f.k("CustomerCenter custom action: id=", actionIdentifier, ", purchase=", purchaseIdentifier));
            ((Analytics) InAppPurchasesService.this.analytics.get()).log(new Analytics.Event.CustomerCenterCustomAction(actionIdentifier));
            g0.D(InAppPurchasesService.this.coroutineScope, null, null, new InAppPurchasesService$2$onCustomActionSelected$1(InAppPurchasesService.this, actionIdentifier, purchaseIdentifier, null), 3);
        }

        @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
        public void onFeedbackSurveyCompleted(String feedbackSurveyOptionId) {
            feedbackSurveyOptionId.getClass();
            InAppPurchasesService.this.logger.log(InAppPurchasesService.this.tag, "CustomerCenter onFeedbackSurveyCompleted: ".concat(feedbackSurveyOptionId));
            ((Analytics) InAppPurchasesService.this.analytics.get()).log(new Analytics.Event.CustomerCenterFeedbackSurveyCompleted(feedbackSurveyOptionId));
        }

        @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
        public void onManagementOptionSelected(CustomerCenterManagementOption action) {
            action.getClass();
            InAppPurchasesService.this.logger.log(InAppPurchasesService.this.tag, "CustomerCenter onManagementOptionSelected: " + action);
            ((Analytics) InAppPurchasesService.this.analytics.get()).log(new Analytics.Event.CustomerCenterManagementOptionSelected(action.toString()));
        }

        @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
        public void onPromotionalOfferSucceeded(CustomerInfo customerInfo, StoreTransaction transaction) {
            customerInfo.getClass();
            transaction.getClass();
            i.r("CustomerCenter onPromotionalOfferSucceeded: orderId=", transaction.getOrderId(), InAppPurchasesService.this.logger, InAppPurchasesService.this.tag);
        }

        @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
        public void onRestoreCompleted(CustomerInfo customerInfo) {
            customerInfo.getClass();
            InAppPurchasesService.this.logger.log(InAppPurchasesService.this.tag, "CustomerCenter onRestoreCompleted");
            ((Analytics) InAppPurchasesService.this.analytics.get()).log(Analytics.Event.CustomerCenterRestoreCompleted.INSTANCE);
        }

        @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
        public void onRestoreFailed(PurchasesError r82) {
            r82.getClass();
            Logger.logWarning$default(InAppPurchasesService.this.logger, InAppPurchasesService.this.tag, f.i("CustomerCenter onRestoreFailed: ", r82.getMessage()), null, 4, null);
            ((Analytics) InAppPurchasesService.this.analytics.get()).log(new Analytics.Event.CustomerCenterRestoreFailed(r82.getMessage()));
        }

        @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
        public void onRestoreInitiated(Resumable resume) {
            resume.getClass();
            InAppPurchasesService.this.logger.log(InAppPurchasesService.this.tag, "CustomerCenter onRestoreInitiated");
            resume.resume(true);
        }

        @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
        public void onRestoreStarted() {
            InAppPurchasesService.this.logger.log(InAppPurchasesService.this.tag, "CustomerCenter onRestoreStarted");
            ((Analytics) InAppPurchasesService.this.analytics.get()).log(Analytics.Event.CustomerCenterRestoreStarted.INSTANCE);
        }

        @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
        public void onShowingManageSubscriptions() {
            InAppPurchasesService.this.logger.log(InAppPurchasesService.this.tag, "CustomerCenter onShowingManageSubscriptions");
            ((Analytics) InAppPurchasesService.this.analytics.get()).log(Analytics.Event.CustomerCenterShowingManageSubscriptions.INSTANCE);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Period.Unit.values().length];
            try {
                iArr[Period.Unit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Period.Unit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Period.Unit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InAppPurchasesService(jl.a aVar, jl.a aVar2, jl.a aVar3, jl.a aVar4, DispatcherFactory dispatcherFactory, Logger logger, @ApplicationCoroutineScope d0 d0Var, Context context) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        dispatcherFactory.getClass();
        logger.getClass();
        d0Var.getClass();
        context.getClass();
        this.purchases = aVar;
        this.customerService = aVar2;
        this.googlePlayService = aVar3;
        this.analytics = aVar4;
        this.dispatcherFactory = dispatcherFactory;
        this.logger = logger;
        this.coroutineScope = d0Var;
        this.context = context;
        this.tag = "InAppPurchasesService";
        this.isAuthorized = new AtomicBoolean(false);
        b2 c5 = r.c(Boolean.FALSE);
        this._isEligibleForTrial = c5;
        this.isEligibleForTrial = c5;
        q1 b10 = r.b(0, 4, null, 5);
        this._customerCenterEvents = b10;
        this.customerCenterEvents = new k1(b10);
        ((Purchases) aVar.get()).setUpdatedCustomerInfoListener(new UpdatedCustomerInfoListener() { // from class: io.elevenlabs.payments.b
            @Override // com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener
            public final void onReceived(CustomerInfo customerInfo) {
                InAppPurchasesService._init_$lambda$0(InAppPurchasesService.this, customerInfo);
            }
        });
        ((Purchases) aVar.get()).setCustomerCenterListener(new CustomerCenterListener() { // from class: io.elevenlabs.payments.InAppPurchasesService.2
            public AnonymousClass2() {
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onCustomActionSelected(String actionIdentifier, String purchaseIdentifier) {
                actionIdentifier.getClass();
                InAppPurchasesService.this.logger.log(InAppPurchasesService.this.tag, f.k("CustomerCenter custom action: id=", actionIdentifier, ", purchase=", purchaseIdentifier));
                ((Analytics) InAppPurchasesService.this.analytics.get()).log(new Analytics.Event.CustomerCenterCustomAction(actionIdentifier));
                g0.D(InAppPurchasesService.this.coroutineScope, null, null, new InAppPurchasesService$2$onCustomActionSelected$1(InAppPurchasesService.this, actionIdentifier, purchaseIdentifier, null), 3);
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onFeedbackSurveyCompleted(String feedbackSurveyOptionId) {
                feedbackSurveyOptionId.getClass();
                InAppPurchasesService.this.logger.log(InAppPurchasesService.this.tag, "CustomerCenter onFeedbackSurveyCompleted: ".concat(feedbackSurveyOptionId));
                ((Analytics) InAppPurchasesService.this.analytics.get()).log(new Analytics.Event.CustomerCenterFeedbackSurveyCompleted(feedbackSurveyOptionId));
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onManagementOptionSelected(CustomerCenterManagementOption action) {
                action.getClass();
                InAppPurchasesService.this.logger.log(InAppPurchasesService.this.tag, "CustomerCenter onManagementOptionSelected: " + action);
                ((Analytics) InAppPurchasesService.this.analytics.get()).log(new Analytics.Event.CustomerCenterManagementOptionSelected(action.toString()));
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onPromotionalOfferSucceeded(CustomerInfo customerInfo, StoreTransaction transaction) {
                customerInfo.getClass();
                transaction.getClass();
                i.r("CustomerCenter onPromotionalOfferSucceeded: orderId=", transaction.getOrderId(), InAppPurchasesService.this.logger, InAppPurchasesService.this.tag);
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreCompleted(CustomerInfo customerInfo) {
                customerInfo.getClass();
                InAppPurchasesService.this.logger.log(InAppPurchasesService.this.tag, "CustomerCenter onRestoreCompleted");
                ((Analytics) InAppPurchasesService.this.analytics.get()).log(Analytics.Event.CustomerCenterRestoreCompleted.INSTANCE);
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreFailed(PurchasesError r82) {
                r82.getClass();
                Logger.logWarning$default(InAppPurchasesService.this.logger, InAppPurchasesService.this.tag, f.i("CustomerCenter onRestoreFailed: ", r82.getMessage()), null, 4, null);
                ((Analytics) InAppPurchasesService.this.analytics.get()).log(new Analytics.Event.CustomerCenterRestoreFailed(r82.getMessage()));
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreInitiated(Resumable resume) {
                resume.getClass();
                InAppPurchasesService.this.logger.log(InAppPurchasesService.this.tag, "CustomerCenter onRestoreInitiated");
                resume.resume(true);
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreStarted() {
                InAppPurchasesService.this.logger.log(InAppPurchasesService.this.tag, "CustomerCenter onRestoreStarted");
                ((Analytics) InAppPurchasesService.this.analytics.get()).log(Analytics.Event.CustomerCenterRestoreStarted.INSTANCE);
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onShowingManageSubscriptions() {
                InAppPurchasesService.this.logger.log(InAppPurchasesService.this.tag, "CustomerCenter onShowingManageSubscriptions");
                ((Analytics) InAppPurchasesService.this.analytics.get()).log(Analytics.Event.CustomerCenterShowingManageSubscriptions.INSTANCE);
            }
        });
        g0.D(d0Var, dispatcherFactory.getDefault(), null, new AnonymousClass3(null), 2);
    }

    public static final void _init_$lambda$0(InAppPurchasesService inAppPurchasesService, CustomerInfo customerInfo) {
        customerInfo.getClass();
        Map<String, Date> allExpirationDatesByProduct = customerInfo.getAllExpirationDatesByProduct();
        inAppPurchasesService.rcEligibleForTrial = allExpirationDatesByProduct.isEmpty();
        inAppPurchasesService.logger.log(inAppPurchasesService.tag, "CustomerInfo updated - rcEligibleForTrial=" + inAppPurchasesService.rcEligibleForTrial + ", expirationsByProduct=" + allExpirationDatesByProduct);
        inAppPurchasesService.updateTrialEligibility();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r6 == r4) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object auth(c<? super AsyncCallResult<z>> cVar) {
        InAppPurchasesService$auth$1 inAppPurchasesService$auth$1;
        int i10;
        Customer customer;
        if (cVar instanceof InAppPurchasesService$auth$1) {
            inAppPurchasesService$auth$1 = (InAppPurchasesService$auth$1) cVar;
            int i11 = inAppPurchasesService$auth$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                inAppPurchasesService$auth$1.label = i11 - Integer.MIN_VALUE;
                Object obj = inAppPurchasesService$auth$1.result;
                i10 = inAppPurchasesService$auth$1.label;
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
                    ir.i customerOrNull = ((CustomerService) this.customerService.get()).getCustomerOrNull();
                    inAppPurchasesService$auth$1.label = 1;
                    obj = r.w(customerOrNull, inAppPurchasesService$auth$1);
                }
                customer = (Customer) obj;
                if (customer != null) {
                    return new AsyncCallResult.Error(new AsyncCallResult.AsyncCallError.UnknownError("User is not signed in"));
                }
                inAppPurchasesService$auth$1.L$0 = null;
                inAppPurchasesService$auth$1.label = 2;
                Object authCustomer = authCustomer(customer, inAppPurchasesService$auth$1);
                if (authCustomer == obj2) {
                    return obj2;
                }
                return authCustomer;
            }
        }
        inAppPurchasesService$auth$1 = new InAppPurchasesService$auth$1(this, cVar);
        Object obj3 = inAppPurchasesService$auth$1.result;
        i10 = inAppPurchasesService$auth$1.label;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        customer = (Customer) obj3;
        if (customer != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        if (setFirebaseAppInstanceID(r8, r0) != r6) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object authCustomer(Customer customer, c<? super AsyncCallResult<z>> cVar) {
        InAppPurchasesService$authCustomer$1 inAppPurchasesService$authCustomer$1;
        int i10;
        Purchases purchases;
        try {
            if (cVar instanceof InAppPurchasesService$authCustomer$1) {
                inAppPurchasesService$authCustomer$1 = (InAppPurchasesService$authCustomer$1) cVar;
                int i11 = inAppPurchasesService$authCustomer$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    inAppPurchasesService$authCustomer$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = inAppPurchasesService$authCustomer$1.result;
                    i10 = inAppPurchasesService$authCustomer$1.label;
                    z zVar = z.f31622a;
                    Object obj2 = xn.a.f37986a;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                sn.a.g(obj);
                                this.isAuthorized.set(true);
                                return new AsyncCallResult.Success(zVar);
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        purchases = (Purchases) inAppPurchasesService$authCustomer$1.L$1;
                        sn.a.g(obj);
                    } else {
                        sn.a.g(obj);
                        Object obj3 = this.purchases.get();
                        obj3.getClass();
                        Purchases purchases2 = (Purchases) obj3;
                        if (this.isAuthorized.get() && !purchases2.isAnonymous()) {
                            return new AsyncCallResult.Success(zVar);
                        }
                        String id2 = customer.getId();
                        inAppPurchasesService$authCustomer$1.L$0 = null;
                        inAppPurchasesService$authCustomer$1.L$1 = purchases2;
                        inAppPurchasesService$authCustomer$1.label = 1;
                        if (CoroutinesExtensionsKt.awaitLogIn(purchases2, id2, inAppPurchasesService$authCustomer$1) != obj2) {
                            purchases = purchases2;
                        } else {
                            return obj2;
                        }
                    }
                    purchases.collectDeviceIdentifiers();
                    inAppPurchasesService$authCustomer$1.L$0 = null;
                    inAppPurchasesService$authCustomer$1.L$1 = null;
                    inAppPurchasesService$authCustomer$1.label = 2;
                }
            }
            if (i10 == 0) {
            }
            purchases.collectDeviceIdentifiers();
            inAppPurchasesService$authCustomer$1.L$0 = null;
            inAppPurchasesService$authCustomer$1.L$1 = null;
            inAppPurchasesService$authCustomer$1.label = 2;
        } catch (PurchasesException e10) {
            return new AsyncCallResult.Error(new AsyncCallResult.AsyncCallError.ApiError("payment_error", e10.getLocalizedMessage()));
        }
        inAppPurchasesService$authCustomer$1 = new InAppPurchasesService$authCustomer$1(this, cVar);
        Object obj4 = inAppPurchasesService$authCustomer$1.result;
        i10 = inAppPurchasesService$authCustomer$1.label;
        z zVar2 = z.f31622a;
        Object obj22 = xn.a.f37986a;
    }

    public final Object awaitConnection(jd.b bVar, c<? super Boolean> cVar) {
        final n nVar = new n(1, gg.b.V(cVar));
        nVar.t();
        if (bVar.e()) {
            if (nVar.isActive()) {
                nVar.resumeWith(Boolean.TRUE);
            }
        } else {
            bVar.j(new d() { // from class: io.elevenlabs.payments.InAppPurchasesService$awaitConnection$2$1
                @Override // jd.d
                public void onBillingServiceDisconnected() {
                    if (l.this.isActive()) {
                        l.this.resumeWith(Boolean.FALSE);
                    }
                }

                @Override // jd.d
                public void onBillingSetupFinished(jd.l p02) {
                    p02.getClass();
                    if (l.this.isActive()) {
                        l.this.resumeWith(Boolean.TRUE);
                    }
                }
            });
        }
        return nVar.s();
    }

    private final PurchasesService.ReadPurchaseResult mapBillingResponseToReadPurchaseResult(int responseCode) {
        if (responseCode != -2) {
            if (responseCode != -1 && responseCode != 12) {
                switch (responseCode) {
                    case 1:
                        return PurchasesService.ReadPurchaseResult.Cancelled.INSTANCE;
                    case 2:
                    case 3:
                        break;
                    case 4:
                    case 5:
                    case 8:
                        return PurchasesService.ReadPurchaseResult.Error.ItemNotAvailable.INSTANCE;
                    case 6:
                        return PurchasesService.ReadPurchaseResult.Error.UnknownError.INSTANCE;
                    case 7:
                        return PurchasesService.ReadPurchaseResult.PurchasePending.INSTANCE;
                    default:
                        return PurchasesService.ReadPurchaseResult.Error.UnknownError.INSTANCE;
                }
            } else {
                return PurchasesService.ReadPurchaseResult.Error.ConnectionError.INSTANCE;
            }
        }
        return PurchasesService.ReadPurchaseResult.Error.BillingUnavailable.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: pollForPurchaseConfirmation-ck1zr5g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m987pollForPurchaseConfirmationck1zr5g(String str, String str2, long j4, long j10, c<? super AsyncCallResult<z>> cVar) {
        InAppPurchasesService$pollForPurchaseConfirmation$1 inAppPurchasesService$pollForPurchaseConfirmation$1;
        int i10;
        long j11;
        if (cVar instanceof InAppPurchasesService$pollForPurchaseConfirmation$1) {
            inAppPurchasesService$pollForPurchaseConfirmation$1 = (InAppPurchasesService$pollForPurchaseConfirmation$1) cVar;
            int i11 = inAppPurchasesService$pollForPurchaseConfirmation$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                inAppPurchasesService$pollForPurchaseConfirmation$1.label = i11 - Integer.MIN_VALUE;
                InAppPurchasesService$pollForPurchaseConfirmation$1 inAppPurchasesService$pollForPurchaseConfirmation$12 = inAppPurchasesService$pollForPurchaseConfirmation$1;
                Object obj = inAppPurchasesService$pollForPurchaseConfirmation$12.result;
                i10 = inAppPurchasesService$pollForPurchaseConfirmation$12.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        j11 = inAppPurchasesService$pollForPurchaseConfirmation$12.J$0;
                        try {
                            sn.a.g(obj);
                        } catch (j2 unused) {
                            Logger logger = this.logger;
                            String str3 = this.tag;
                            xq.a aVar = xq.b.f38124b;
                            logger.log(str3, android.gov.nist.javax.sip.header.a.k("pollForConfirmation - timeout after ", xq.b.i(j11, xq.d.SECONDS), "s"));
                            return new AsyncCallResult.Success(z.f31622a);
                        }
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    try {
                        InAppPurchasesService$pollForPurchaseConfirmation$2 inAppPurchasesService$pollForPurchaseConfirmation$2 = new InAppPurchasesService$pollForPurchaseConfirmation$2(this, j10, str, str2, null);
                        inAppPurchasesService$pollForPurchaseConfirmation$12.L$0 = null;
                        inAppPurchasesService$pollForPurchaseConfirmation$12.L$1 = null;
                        inAppPurchasesService$pollForPurchaseConfirmation$12.J$0 = j4;
                        inAppPurchasesService$pollForPurchaseConfirmation$12.J$1 = j10;
                        inAppPurchasesService$pollForPurchaseConfirmation$12.label = 1;
                        obj = g0.R(g0.N(j4), inAppPurchasesService$pollForPurchaseConfirmation$2, inAppPurchasesService$pollForPurchaseConfirmation$12);
                        xn.a aVar2 = xn.a.f37986a;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        j11 = j4;
                    } catch (j2 unused2) {
                        j11 = j4;
                        Logger logger2 = this.logger;
                        String str32 = this.tag;
                        xq.a aVar3 = xq.b.f38124b;
                        logger2.log(str32, android.gov.nist.javax.sip.header.a.k("pollForConfirmation - timeout after ", xq.b.i(j11, xq.d.SECONDS), "s"));
                        return new AsyncCallResult.Success(z.f31622a);
                    }
                }
                return (AsyncCallResult) obj;
            }
        }
        inAppPurchasesService$pollForPurchaseConfirmation$1 = new InAppPurchasesService$pollForPurchaseConfirmation$1(this, cVar);
        InAppPurchasesService$pollForPurchaseConfirmation$1 inAppPurchasesService$pollForPurchaseConfirmation$122 = inAppPurchasesService$pollForPurchaseConfirmation$1;
        Object obj2 = inAppPurchasesService$pollForPurchaseConfirmation$122.result;
        i10 = inAppPurchasesService$pollForPurchaseConfirmation$122.label;
        if (i10 == 0) {
        }
        return (AsyncCallResult) obj2;
    }

    public static final x purchaseRead$lambda$0(InAppPurchasesService inAppPurchasesService, final ho.l lVar) {
        lVar.getClass();
        return new x() { // from class: io.elevenlabs.payments.a
            @Override // jd.x
            public final void onPurchasesUpdated(jd.l lVar2, List list) {
                InAppPurchasesService.purchaseRead$lambda$0$0(InAppPurchasesService.this, lVar, lVar2, list);
            }
        };
    }

    public static final void purchaseRead$lambda$0$0(InAppPurchasesService inAppPurchasesService, ho.l lVar, jd.l lVar2, List list) {
        Purchase purchase;
        lVar2.getClass();
        inAppPurchasesService.logger.log(inAppPurchasesService.tag, p.n.h(lVar2.f19444a, "purchaseRead - billing result - ", " - ", lVar2.f19446c));
        int i10 = lVar2.f19444a;
        if (list != null) {
            purchase = (Purchase) o.y0(list);
        } else {
            purchase = null;
        }
        lVar.invoke(new BillingClientResult(i10, purchase));
    }

    public static final BillingClientResult purchaseRead$lambda$1() {
        return new BillingClientResult(12, null, 2, null);
    }

    public static final BillingClientResult purchaseRead$lambda$2(Exception exc) {
        exc.getClass();
        return new BillingClientResult(6, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object queryProductDetails(jd.b bVar, String str, c<? super t> cVar) {
        InAppPurchasesService$queryProductDetails$1 inAppPurchasesService$queryProductDetails$1;
        int i10;
        List list;
        if (cVar instanceof InAppPurchasesService$queryProductDetails$1) {
            inAppPurchasesService$queryProductDetails$1 = (InAppPurchasesService$queryProductDetails$1) cVar;
            int i11 = inAppPurchasesService$queryProductDetails$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                inAppPurchasesService$queryProductDetails$1.label = i11 - Integer.MIN_VALUE;
                Object obj = inAppPurchasesService$queryProductDetails$1.result;
                i10 = inAppPurchasesService$queryProductDetails$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    gn.b bVar2 = new gn.b(1);
                    bVar2.f11591b = str;
                    bVar2.f11592c = "inapp";
                    List H = ig.f.H(bVar2.a());
                    o1 o1Var = new o1(7, false);
                    o1Var.A(H);
                    if (((zzbw) o1Var.f13189b) != null) {
                        jd.z zVar = new jd.z(o1Var);
                        i.r("queryProductDetails - getting product details for ", str, this.logger, this.tag);
                        inAppPurchasesService$queryProductDetails$1.L$0 = null;
                        inAppPurchasesService$queryProductDetails$1.L$1 = null;
                        inAppPurchasesService$queryProductDetails$1.L$2 = null;
                        inAppPurchasesService$queryProductDetails$1.L$3 = null;
                        inAppPurchasesService$queryProductDetails$1.label = 1;
                        u b10 = g0.b();
                        o1 o1Var2 = new o1(6, false);
                        o1Var2.f13189b = b10;
                        bVar.g(zVar, o1Var2);
                        obj = b10.s(inAppPurchasesService$queryProductDetails$1);
                        xn.a aVar = xn.a.f37986a;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        c6.t("Product list must be set to a non empty list.");
                        return null;
                    }
                }
                list = ((v) obj).f19520b;
                if (list != null) {
                    return null;
                }
                return (t) o.y0(list);
            }
        }
        inAppPurchasesService$queryProductDetails$1 = new InAppPurchasesService$queryProductDetails$1(this, cVar);
        Object obj2 = inAppPurchasesService$queryProductDetails$1.result;
        i10 = inAppPurchasesService$queryProductDetails$1.label;
        if (i10 == 0) {
        }
        list = ((v) obj2).f19520b;
        if (list != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(4:21|22|23|(1:25))|12|(1:14)|16|17))|32|6|7|(0)(0)|12|(0)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        io.elevenlabs.domain.Logger.logWarning$default(r6.logger, r6.tag, defpackage.f.i("Failed to set Firebase app instance ID: ", r0.getMessage()), null, 4, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[Catch: Exception -> 0x0029, CancellationException -> 0x002c, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x002c, Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x0053, B:14:0x0057, B:22:0x0039), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setFirebaseAppInstanceID(Purchases purchases, c<? super z> cVar) {
        InAppPurchasesService$setFirebaseAppInstanceID$1 inAppPurchasesService$setFirebaseAppInstanceID$1;
        int i10;
        String str;
        if (cVar instanceof InAppPurchasesService$setFirebaseAppInstanceID$1) {
            inAppPurchasesService$setFirebaseAppInstanceID$1 = (InAppPurchasesService$setFirebaseAppInstanceID$1) cVar;
            int i11 = inAppPurchasesService$setFirebaseAppInstanceID$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                inAppPurchasesService$setFirebaseAppInstanceID$1.label = i11 - Integer.MIN_VALUE;
                Object obj = inAppPurchasesService$setFirebaseAppInstanceID$1.result;
                i10 = inAppPurchasesService$setFirebaseAppInstanceID$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        purchases = (Purchases) inAppPurchasesService$setFirebaseAppInstanceID$1.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    Task<String> appInstanceId = FirebaseAnalytics.getInstance(this.context).getAppInstanceId();
                    appInstanceId.getClass();
                    inAppPurchasesService$setFirebaseAppInstanceID$1.L$0 = purchases;
                    inAppPurchasesService$setFirebaseAppInstanceID$1.label = 1;
                    obj = kj.c.j(appInstanceId, inAppPurchasesService$setFirebaseAppInstanceID$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                str = (String) obj;
                if (str != null) {
                    purchases.setFirebaseAppInstanceID(str);
                }
                return z.f31622a;
            }
        }
        inAppPurchasesService$setFirebaseAppInstanceID$1 = new InAppPurchasesService$setFirebaseAppInstanceID$1(this, cVar);
        Object obj2 = inAppPurchasesService$setFirebaseAppInstanceID$1.result;
        i10 = inAppPurchasesService$setFirebaseAppInstanceID$1.label;
        if (i10 == 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        return z.f31622a;
    }

    private final MoneyPrice toMoneyPrice(Price price) {
        return new MoneyPrice(price.getAmountMicros() / 10000, price.getCurrencyCode());
    }

    public final void updateTrialEligibility() {
        boolean z6;
        if (this.rcEligibleForTrial && this.customerCanTrial) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.logger.log(this.tag, "updateTrialEligibility: rcEligible=" + this.rcEligibleForTrial + ", customerCanTrial=" + this.customerCanTrial + " -> " + z6);
        this._isEligibleForTrial.setValue(Boolean.valueOf(z6));
    }

    public final <T> Object withBillingClient(ho.l lVar, ho.a aVar, ho.l lVar2, q qVar, c<? super T> cVar) {
        n nVar = new n(1, gg.b.V(cVar));
        nVar.t();
        g0.D(g0.c(nVar.f9867e), this.dispatcherFactory.getIo(), null, new InAppPurchasesService$withBillingClient$3$1(lVar, this, nVar, aVar, qVar, lVar2, null), 2);
        return nVar.s();
    }

    public static /* synthetic */ Object withBillingClient$default(InAppPurchasesService inAppPurchasesService, ho.l lVar, ho.a aVar, ho.l lVar2, q qVar, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = new io.elevenlabs.highlighter.z(9);
        }
        return inAppPurchasesService.withBillingClient(lVar, aVar, lVar2, qVar, cVar);
    }

    public static final x withBillingClient$lambda$0(ho.l lVar) {
        lVar.getClass();
        return new com.revenuecat.purchases.c(1);
    }

    public static final x withBillingClient$lambda$2(ho.l lVar) {
        lVar.getClass();
        return new com.revenuecat.purchases.c(2);
    }

    public static final AsyncCallResult withBillingClient$lambda$3() {
        return new AsyncCallResult.Error(AsyncCallResult.AsyncCallError.NetworkError.INSTANCE);
    }

    public static final AsyncCallResult withBillingClient$lambda$4(Exception exc) {
        exc.getClass();
        String message = exc.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        return new AsyncCallResult.Error(new AsyncCallResult.AsyncCallError.UnknownError(message));
    }

    @Override // io.elevenlabs.domain.services.PurchasesService
    public Object ensureAuthenticated(c<? super z> cVar) {
        Object auth = auth(cVar);
        if (auth == xn.a.f37986a) {
            return auth;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.domain.services.PurchasesService
    public n1 getCustomerCenterEvents() {
        return this.customerCenterEvents;
    }

    @Override // io.elevenlabs.domain.services.PurchasesService
    public Object getGooglePlayProduct(String str, c<? super AsyncCallResult<RawOneTimeProduct>> cVar) {
        this.logger.log(this.tag, "getGooglePlayProduct - start");
        return withBillingClient(new InAppPurchasesService$getGooglePlayProduct$2(this, str, null), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        if (r10 == r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        if (r10 == r7) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063 A[Catch: PurchasesException -> 0x0034, TRY_ENTER, TryCatch #0 {PurchasesException -> 0x0034, blocks: (B:13:0x0030, B:14:0x0080, B:15:0x0091, B:17:0x0097, B:19:0x00b2, B:31:0x0063), top: B:8:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0048  */
    @Override // io.elevenlabs.domain.services.PurchasesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getProducts(List<String> list, c<? super AsyncCallResult<List<RawOneTimeProduct>>> cVar) {
        InAppPurchasesService$getProducts$1 inAppPurchasesService$getProducts$1;
        int i10;
        AsyncCallResult asyncCallResult;
        try {
            if (cVar instanceof InAppPurchasesService$getProducts$1) {
                inAppPurchasesService$getProducts$1 = (InAppPurchasesService$getProducts$1) cVar;
                int i11 = inAppPurchasesService$getProducts$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    inAppPurchasesService$getProducts$1.label = i11 - Integer.MIN_VALUE;
                    InAppPurchasesService$getProducts$1 inAppPurchasesService$getProducts$12 = inAppPurchasesService$getProducts$1;
                    Object obj = inAppPurchasesService$getProducts$12.result;
                    i10 = inAppPurchasesService$getProducts$12.label;
                    Object obj2 = xn.a.f37986a;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                sn.a.g(obj);
                                List<StoreProduct> list2 = (List) obj;
                                ArrayList arrayList = new ArrayList(p.a0(list2, 10));
                                for (StoreProduct storeProduct : list2) {
                                    arrayList.add(new RawOneTimeProduct(storeProduct.getId(), toMoneyPrice(storeProduct.getPrice())));
                                }
                                return new AsyncCallResult.Success(arrayList);
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list = (List) inAppPurchasesService$getProducts$12.L$0;
                        sn.a.g(obj);
                    } else {
                        sn.a.g(obj);
                        inAppPurchasesService$getProducts$12.L$0 = list;
                        inAppPurchasesService$getProducts$12.label = 1;
                        obj = auth(inAppPurchasesService$getProducts$12);
                    }
                    List<String> list3 = list;
                    asyncCallResult = (AsyncCallResult) obj;
                    if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                        return ((AsyncCallResult.Error) asyncCallResult).cast();
                    }
                    Object obj3 = this.purchases.get();
                    obj3.getClass();
                    inAppPurchasesService$getProducts$12.L$0 = null;
                    inAppPurchasesService$getProducts$12.L$1 = null;
                    inAppPurchasesService$getProducts$12.label = 2;
                    obj = CoroutinesExtensionsCommonKt.awaitGetProducts$default((Purchases) obj3, list3, null, inAppPurchasesService$getProducts$12, 2, null);
                }
            }
            if (i10 == 0) {
            }
            List<String> list32 = list;
            asyncCallResult = (AsyncCallResult) obj;
            if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
            }
        } catch (PurchasesException e10) {
            return new AsyncCallResult.Error(new AsyncCallResult.AsyncCallError.ApiError("get_products_error", e10.getLocalizedMessage()));
        }
        inAppPurchasesService$getProducts$1 = new InAppPurchasesService$getProducts$1(this, cVar);
        InAppPurchasesService$getProducts$1 inAppPurchasesService$getProducts$122 = inAppPurchasesService$getProducts$1;
        Object obj4 = inAppPurchasesService$getProducts$122.result;
        i10 = inAppPurchasesService$getProducts$122.label;
        Object obj22 = xn.a.f37986a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0064, code lost:
    
        if (r2 == r13) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0124 A[Catch: PurchasesException -> 0x0040, LOOP:0: B:18:0x011e->B:20:0x0124, LOOP_END, TryCatch #0 {PurchasesException -> 0x0040, blocks: (B:13:0x003b, B:14:0x0106, B:17:0x0115, B:18:0x011e, B:20:0x0124, B:22:0x0133, B:23:0x013c, B:25:0x0142, B:30:0x01dc, B:34:0x0153, B:36:0x0159, B:38:0x0161, B:39:0x0167, B:41:0x0175, B:42:0x017e, B:44:0x0184, B:46:0x018f, B:51:0x01a9, B:53:0x01d5, B:54:0x01b9, B:55:0x01c7, B:62:0x01e1, B:73:0x0075, B:74:0x0082, B:76:0x0088, B:78:0x009d, B:79:0x00a6, B:81:0x00ac, B:86:0x00bc, B:92:0x00c0, B:93:0x00cd, B:95:0x00d3, B:97:0x00e3), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0142 A[Catch: PurchasesException -> 0x0040, TryCatch #0 {PurchasesException -> 0x0040, blocks: (B:13:0x003b, B:14:0x0106, B:17:0x0115, B:18:0x011e, B:20:0x0124, B:22:0x0133, B:23:0x013c, B:25:0x0142, B:30:0x01dc, B:34:0x0153, B:36:0x0159, B:38:0x0161, B:39:0x0167, B:41:0x0175, B:42:0x017e, B:44:0x0184, B:46:0x018f, B:51:0x01a9, B:53:0x01d5, B:54:0x01b9, B:55:0x01c7, B:62:0x01e1, B:73:0x0075, B:74:0x0082, B:76:0x0088, B:78:0x009d, B:79:0x00a6, B:81:0x00ac, B:86:0x00bc, B:92:0x00c0, B:93:0x00cd, B:95:0x00d3, B:97:0x00e3), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0075 A[Catch: PurchasesException -> 0x0040, TRY_ENTER, TryCatch #0 {PurchasesException -> 0x0040, blocks: (B:13:0x003b, B:14:0x0106, B:17:0x0115, B:18:0x011e, B:20:0x0124, B:22:0x0133, B:23:0x013c, B:25:0x0142, B:30:0x01dc, B:34:0x0153, B:36:0x0159, B:38:0x0161, B:39:0x0167, B:41:0x0175, B:42:0x017e, B:44:0x0184, B:46:0x018f, B:51:0x01a9, B:53:0x01d5, B:54:0x01b9, B:55:0x01c7, B:62:0x01e1, B:73:0x0075, B:74:0x0082, B:76:0x0088, B:78:0x009d, B:79:0x00a6, B:81:0x00ac, B:86:0x00bc, B:92:0x00c0, B:93:0x00cd, B:95:0x00d3, B:97:0x00e3), top: B:8:0x0029 }] */
    @Override // io.elevenlabs.domain.services.PurchasesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getSubscriptionProducts(List<String> list, c<? super AsyncCallResult<List<RawSubscriptionProduct>>> cVar) {
        InAppPurchasesService$getSubscriptionProducts$1 inAppPurchasesService$getSubscriptionProducts$1;
        int i10;
        List<String> list2;
        Object auth;
        AsyncCallResult asyncCallResult;
        List<String> list3;
        int H;
        Iterator<T> it;
        SubscriptionOption subscriptionOption;
        PricingPhase pricingPhase;
        MoneyPrice moneyPrice;
        MoneyPrice moneyPrice2;
        FreeTrialDuration freeTrialDuration;
        RawSubscriptionProduct rawSubscriptionProduct;
        FreeTrialDuration days;
        try {
            if (cVar instanceof InAppPurchasesService$getSubscriptionProducts$1) {
                inAppPurchasesService$getSubscriptionProducts$1 = (InAppPurchasesService$getSubscriptionProducts$1) cVar;
                int i11 = inAppPurchasesService$getSubscriptionProducts$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    inAppPurchasesService$getSubscriptionProducts$1.label = i11 - Integer.MIN_VALUE;
                    InAppPurchasesService$getSubscriptionProducts$1 inAppPurchasesService$getSubscriptionProducts$12 = inAppPurchasesService$getSubscriptionProducts$1;
                    Object obj = inAppPurchasesService$getSubscriptionProducts$12.result;
                    i10 = inAppPurchasesService$getSubscriptionProducts$12.label;
                    Object obj2 = xn.a.f37986a;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                list3 = (List) inAppPurchasesService$getSubscriptionProducts$12.L$0;
                                sn.a.g(obj);
                                Iterable iterable = (Iterable) obj;
                                H = a0.H(p.a0(iterable, 10));
                                if (H < 16) {
                                    H = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(H);
                                for (Object obj3 : iterable) {
                                    linkedHashMap.put(((StoreProduct) obj3).getId(), obj3);
                                }
                                ArrayList arrayList = new ArrayList();
                                it = list3.iterator();
                                while (it.hasNext()) {
                                    StoreProduct storeProduct = (StoreProduct) linkedHashMap.get((String) it.next());
                                    if (storeProduct == null) {
                                        rawSubscriptionProduct = null;
                                    } else {
                                        SubscriptionOptions subscriptionOptions = storeProduct.getSubscriptionOptions();
                                        if (subscriptionOptions != null) {
                                            subscriptionOption = subscriptionOptions.getFreeTrial();
                                        } else {
                                            subscriptionOption = null;
                                        }
                                        if (subscriptionOption != null) {
                                            pricingPhase = subscriptionOption.getFreePhase();
                                        } else {
                                            pricingPhase = null;
                                        }
                                        String id2 = storeProduct.getId();
                                        String title = storeProduct.getTitle();
                                        Price pricePerYear$default = StoreProduct.pricePerYear$default(storeProduct, null, 1, null);
                                        if (pricePerYear$default != null) {
                                            moneyPrice = toMoneyPrice(pricePerYear$default);
                                        } else {
                                            moneyPrice = null;
                                        }
                                        Price pricePerMonth$default = StoreProduct.pricePerMonth$default(storeProduct, null, 1, null);
                                        if (pricePerMonth$default != null) {
                                            moneyPrice2 = toMoneyPrice(pricePerMonth$default);
                                        } else {
                                            moneyPrice2 = null;
                                        }
                                        if (pricingPhase != null) {
                                            int i12 = WhenMappings.$EnumSwitchMapping$0[pricingPhase.getBillingPeriod().getUnit().ordinal()];
                                            if (i12 != 1) {
                                                if (i12 != 2) {
                                                    if (i12 == 3) {
                                                        days = new FreeTrialDuration.Months(pricingPhase.getBillingPeriod().getValue());
                                                    }
                                                } else {
                                                    days = new FreeTrialDuration.Weeks(pricingPhase.getBillingPeriod().getValue());
                                                }
                                            } else {
                                                days = new FreeTrialDuration.Days(pricingPhase.getBillingPeriod().getValue());
                                            }
                                            freeTrialDuration = days;
                                            rawSubscriptionProduct = new RawSubscriptionProduct(id2, title, moneyPrice2, moneyPrice, freeTrialDuration);
                                        }
                                        freeTrialDuration = null;
                                        rawSubscriptionProduct = new RawSubscriptionProduct(id2, title, moneyPrice2, moneyPrice, freeTrialDuration);
                                    }
                                    if (rawSubscriptionProduct != null) {
                                        arrayList.add(rawSubscriptionProduct);
                                    }
                                }
                                return new AsyncCallResult.Success(arrayList);
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List<String> list4 = (List) inAppPurchasesService$getSubscriptionProducts$12.L$0;
                        sn.a.g(obj);
                        auth = obj;
                        list2 = list4;
                    } else {
                        sn.a.g(obj);
                        list2 = list;
                        inAppPurchasesService$getSubscriptionProducts$12.L$0 = list2;
                        inAppPurchasesService$getSubscriptionProducts$12.label = 1;
                        auth = auth(inAppPurchasesService$getSubscriptionProducts$12);
                    }
                    asyncCallResult = (AsyncCallResult) auth;
                    if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                        return ((AsyncCallResult.Error) asyncCallResult).cast();
                    }
                    ArrayList arrayList2 = new ArrayList(p.a0(list2, 10));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(wq.n.z0((String) it2.next(), new String[]{":"}, 6));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        List list5 = (List) it3.next();
                        if (list5.size() != 2) {
                            list5 = null;
                        }
                        if (list5 != null) {
                            arrayList3.add(list5);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(p.a0(arrayList3, 10));
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add((String) o.w0((List) it4.next()));
                    }
                    Object obj4 = this.purchases.get();
                    obj4.getClass();
                    inAppPurchasesService$getSubscriptionProducts$12.L$0 = list2;
                    inAppPurchasesService$getSubscriptionProducts$12.L$1 = null;
                    inAppPurchasesService$getSubscriptionProducts$12.L$2 = null;
                    inAppPurchasesService$getSubscriptionProducts$12.label = 2;
                    Object awaitGetProducts$default = CoroutinesExtensionsCommonKt.awaitGetProducts$default((Purchases) obj4, arrayList4, null, inAppPurchasesService$getSubscriptionProducts$12, 2, null);
                    if (awaitGetProducts$default != obj2) {
                        list3 = list2;
                        obj = awaitGetProducts$default;
                        Iterable iterable2 = (Iterable) obj;
                        H = a0.H(p.a0(iterable2, 10));
                        if (H < 16) {
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(H);
                        while (r0.hasNext()) {
                        }
                        ArrayList arrayList5 = new ArrayList();
                        it = list3.iterator();
                        while (it.hasNext()) {
                        }
                        return new AsyncCallResult.Success(arrayList5);
                    }
                    return obj2;
                }
            }
            if (i10 == 0) {
            }
            asyncCallResult = (AsyncCallResult) auth;
            if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
            }
        } catch (PurchasesException e10) {
            return new AsyncCallResult.Error(new AsyncCallResult.AsyncCallError.ApiError("get_subscription_products_error", e10.getLocalizedMessage()));
        }
        inAppPurchasesService$getSubscriptionProducts$1 = new InAppPurchasesService$getSubscriptionProducts$1(this, cVar);
        InAppPurchasesService$getSubscriptionProducts$1 inAppPurchasesService$getSubscriptionProducts$122 = inAppPurchasesService$getSubscriptionProducts$1;
        Object obj5 = inAppPurchasesService$getSubscriptionProducts$122.result;
        i10 = inAppPurchasesService$getSubscriptionProducts$122.label;
        Object obj22 = xn.a.f37986a;
    }

    @Override // io.elevenlabs.domain.services.PurchasesService
    /* renamed from: isEligibleForTrial, reason: from getter */
    public z1 getIsEligibleForTrial() {
        return this.isEligibleForTrial;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0106, code lost:
    
        if (r15 == r10) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0077, code lost:
    
        if (r15 == r10) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9 A[Catch: PurchasesException -> 0x0043, PurchasesTransactionException -> 0x0047, TryCatch #2 {PurchasesTransactionException -> 0x0047, PurchasesException -> 0x0043, blocks: (B:14:0x003e, B:15:0x0109, B:21:0x005c, B:22:0x00ad, B:23:0x00b3, B:25:0x00b9, B:29:0x00cc, B:31:0x00d0, B:33:0x00dd, B:44:0x0088), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0 A[Catch: PurchasesException -> 0x0043, PurchasesTransactionException -> 0x0047, TryCatch #2 {PurchasesTransactionException -> 0x0047, PurchasesException -> 0x0043, blocks: (B:14:0x003e, B:15:0x0109, B:21:0x005c, B:22:0x00ad, B:23:0x00b3, B:25:0x00b9, B:29:0x00cc, B:31:0x00d0, B:33:0x00dd, B:44:0x0088), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd A[Catch: PurchasesException -> 0x0043, PurchasesTransactionException -> 0x0047, TryCatch #2 {PurchasesTransactionException -> 0x0047, PurchasesException -> 0x0043, blocks: (B:14:0x003e, B:15:0x0109, B:21:0x005c, B:22:0x00ad, B:23:0x00b3, B:25:0x00b9, B:29:0x00cc, B:31:0x00d0, B:33:0x00dd, B:44:0x0088), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0088 A[Catch: PurchasesException -> 0x0043, PurchasesTransactionException -> 0x0047, TRY_ENTER, TryCatch #2 {PurchasesTransactionException -> 0x0047, PurchasesException -> 0x0043, blocks: (B:14:0x003e, B:15:0x0109, B:21:0x005c, B:22:0x00ad, B:23:0x00b3, B:25:0x00b9, B:29:0x00cc, B:31:0x00d0, B:33:0x00dd, B:44:0x0088), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006a  */
    @Override // io.elevenlabs.domain.services.PurchasesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object purchase(String str, Object obj, c<? super AsyncCallResult<PurchasesService.PurchaseResult>> cVar) {
        InAppPurchasesService$purchase$1 inAppPurchasesService$purchase$1;
        int i10;
        AsyncCallResult asyncCallResult;
        String str2;
        Object obj2;
        Iterator it;
        Object obj3;
        StoreProduct storeProduct;
        try {
            if (cVar instanceof InAppPurchasesService$purchase$1) {
                inAppPurchasesService$purchase$1 = (InAppPurchasesService$purchase$1) cVar;
                int i11 = inAppPurchasesService$purchase$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    inAppPurchasesService$purchase$1.label = i11 - Integer.MIN_VALUE;
                    InAppPurchasesService$purchase$1 inAppPurchasesService$purchase$12 = inAppPurchasesService$purchase$1;
                    Object obj4 = inAppPurchasesService$purchase$12.result;
                    i10 = inAppPurchasesService$purchase$12.label;
                    Object obj5 = xn.a.f37986a;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    sn.a.g(obj4);
                                    return new AsyncCallResult.Success(new PurchasesService.PurchaseResult.Purchased(((PurchaseResult) obj4).getStoreTransaction().getOrderId()));
                                }
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj2 = inAppPurchasesService$purchase$12.L$1;
                            str2 = (String) inAppPurchasesService$purchase$12.L$0;
                            sn.a.g(obj4);
                            it = ((List) obj4).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj3 = it.next();
                                    if (m.c(((StoreProduct) obj3).getId(), str2)) {
                                        break;
                                    }
                                } else {
                                    obj3 = null;
                                    break;
                                }
                            }
                            storeProduct = (StoreProduct) obj3;
                            if (storeProduct != null) {
                                return new AsyncCallResult.Error(new AsyncCallResult.AsyncCallError.UnknownError("Product not found"));
                            }
                            Object obj6 = this.purchases.get();
                            obj6.getClass();
                            obj2.getClass();
                            PurchaseParams build = new PurchaseParams.Builder((Activity) obj2, storeProduct).build();
                            inAppPurchasesService$purchase$12.L$0 = null;
                            inAppPurchasesService$purchase$12.L$1 = null;
                            inAppPurchasesService$purchase$12.L$2 = null;
                            inAppPurchasesService$purchase$12.L$3 = null;
                            inAppPurchasesService$purchase$12.L$4 = null;
                            inAppPurchasesService$purchase$12.label = 3;
                            obj4 = CoroutinesExtensionsCommonKt.awaitPurchase((Purchases) obj6, build, inAppPurchasesService$purchase$12);
                        } else {
                            obj = inAppPurchasesService$purchase$12.L$1;
                            str = (String) inAppPurchasesService$purchase$12.L$0;
                            sn.a.g(obj4);
                        }
                    } else {
                        sn.a.g(obj4);
                        inAppPurchasesService$purchase$12.L$0 = str;
                        inAppPurchasesService$purchase$12.L$1 = obj;
                        inAppPurchasesService$purchase$12.label = 1;
                        obj4 = auth(inAppPurchasesService$purchase$12);
                    }
                    asyncCallResult = (AsyncCallResult) obj4;
                    if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                        return ((AsyncCallResult.Error) asyncCallResult).cast();
                    }
                    Object obj7 = this.purchases.get();
                    obj7.getClass();
                    List H = ig.f.H(str);
                    inAppPurchasesService$purchase$12.L$0 = str;
                    inAppPurchasesService$purchase$12.L$1 = obj;
                    inAppPurchasesService$purchase$12.L$2 = null;
                    inAppPurchasesService$purchase$12.label = 2;
                    obj4 = CoroutinesExtensionsCommonKt.awaitGetProducts$default((Purchases) obj7, H, null, inAppPurchasesService$purchase$12, 2, null);
                    if (obj4 != obj5) {
                        Object obj8 = obj;
                        str2 = str;
                        obj2 = obj8;
                        it = ((List) obj4).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                            }
                        }
                        storeProduct = (StoreProduct) obj3;
                        if (storeProduct != null) {
                        }
                    } else {
                        return obj5;
                    }
                }
            }
            if (i10 == 0) {
            }
            asyncCallResult = (AsyncCallResult) obj4;
            if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
            }
        } catch (PurchasesTransactionException e10) {
            if (e10.getUserCancelled()) {
                return new AsyncCallResult.Success(PurchasesService.PurchaseResult.Cancelled.INSTANCE);
            }
            return new AsyncCallResult.Error(new AsyncCallResult.AsyncCallError.ApiError("payment_error", e10.getLocalizedMessage()));
        } catch (PurchasesException e11) {
            return new AsyncCallResult.Error(new AsyncCallResult.AsyncCallError.ApiError("payment_error", e11.getLocalizedMessage()));
        }
        inAppPurchasesService$purchase$1 = new InAppPurchasesService$purchase$1(this, cVar);
        InAppPurchasesService$purchase$1 inAppPurchasesService$purchase$122 = inAppPurchasesService$purchase$1;
        Object obj42 = inAppPurchasesService$purchase$122.result;
        i10 = inAppPurchasesService$purchase$122.label;
        Object obj52 = xn.a.f37986a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // io.elevenlabs.domain.services.PurchasesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object purchaseRead(String str, String str2, Object obj, c<? super AsyncCallResult<PurchasesService.ReadPurchaseResult>> cVar) {
        InAppPurchasesService$purchaseRead$1 inAppPurchasesService$purchaseRead$1;
        int i10;
        Object obj2;
        String str3;
        Object obj3;
        String str4;
        Customer customer;
        String str5;
        InAppPurchasesService$purchaseRead$1 inAppPurchasesService$purchaseRead$12;
        String str6;
        int responseCode;
        PurchasesService.ReadPurchaseResult mapBillingResponseToReadPurchaseResult;
        Purchase purchase;
        AsyncCallResult asyncCallResult;
        Purchase purchase2;
        AsyncCallResult asyncCallResult2;
        InAppPurchasesService inAppPurchasesService = this;
        if (cVar instanceof InAppPurchasesService$purchaseRead$1) {
            inAppPurchasesService$purchaseRead$1 = (InAppPurchasesService$purchaseRead$1) cVar;
            int i11 = inAppPurchasesService$purchaseRead$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                inAppPurchasesService$purchaseRead$1.label = i11 - Integer.MIN_VALUE;
                InAppPurchasesService$purchaseRead$1 inAppPurchasesService$purchaseRead$13 = inAppPurchasesService$purchaseRead$1;
                Object obj4 = inAppPurchasesService$purchaseRead$13.result;
                i10 = inAppPurchasesService$purchaseRead$13.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    purchase2 = (Purchase) inAppPurchasesService$purchaseRead$13.L$4;
                                    sn.a.g(obj4);
                                    asyncCallResult2 = (AsyncCallResult) obj4;
                                    if (!(asyncCallResult2 instanceof AsyncCallResult.Error)) {
                                        return ((AsyncCallResult.Error) asyncCallResult2).cast();
                                    }
                                    if (purchase2.f5164c.optInt("purchaseState", 1) != 4) {
                                        mapBillingResponseToReadPurchaseResult = PurchasesService.ReadPurchaseResult.PurchaseSuccess.INSTANCE;
                                    } else {
                                        mapBillingResponseToReadPurchaseResult = PurchasesService.ReadPurchaseResult.PurchasePending.INSTANCE;
                                    }
                                    return new AsyncCallResult.Success(mapBillingResponseToReadPurchaseResult);
                                }
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            responseCode = inAppPurchasesService$purchaseRead$13.I$0;
                            Purchase purchase3 = (Purchase) inAppPurchasesService$purchaseRead$13.L$4;
                            str6 = (String) inAppPurchasesService$purchaseRead$13.L$0;
                            sn.a.g(obj4);
                            purchase = purchase3;
                            inAppPurchasesService$purchaseRead$12 = inAppPurchasesService$purchaseRead$13;
                            asyncCallResult = (AsyncCallResult) obj4;
                            if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                                return ((AsyncCallResult.Error) asyncCallResult).cast();
                            }
                            String b10 = purchase.b();
                            b10.getClass();
                            xq.a aVar2 = xq.b.f38124b;
                            xq.d dVar = xq.d.SECONDS;
                            long n2 = g.n(15, dVar);
                            long n10 = g.n(1, dVar);
                            inAppPurchasesService$purchaseRead$12.L$0 = null;
                            inAppPurchasesService$purchaseRead$12.L$1 = null;
                            inAppPurchasesService$purchaseRead$12.L$2 = null;
                            inAppPurchasesService$purchaseRead$12.L$3 = null;
                            inAppPurchasesService$purchaseRead$12.L$4 = purchase;
                            inAppPurchasesService$purchaseRead$12.L$5 = null;
                            inAppPurchasesService$purchaseRead$12.I$0 = responseCode;
                            inAppPurchasesService$purchaseRead$12.label = 4;
                            obj4 = inAppPurchasesService.m987pollForPurchaseConfirmationck1zr5g(str6, b10, n2, n10, inAppPurchasesService$purchaseRead$12);
                            if (obj4 != aVar) {
                                purchase2 = purchase;
                                asyncCallResult2 = (AsyncCallResult) obj4;
                                if (!(asyncCallResult2 instanceof AsyncCallResult.Error)) {
                                }
                            }
                            return aVar;
                        }
                        String str7 = (String) inAppPurchasesService$purchaseRead$13.L$0;
                        sn.a.g(obj4);
                        str6 = str7;
                        inAppPurchasesService$purchaseRead$12 = inAppPurchasesService$purchaseRead$13;
                        BillingClientResult billingClientResult = (BillingClientResult) obj4;
                        responseCode = billingClientResult.getResponseCode();
                        Purchase purchase4 = billingClientResult.getPurchase();
                        if (responseCode != 0) {
                            if (purchase4 != null) {
                                fr.z io2 = inAppPurchasesService.dispatcherFactory.getIo();
                                InAppPurchasesService$purchaseRead$postResult$1 inAppPurchasesService$purchaseRead$postResult$1 = new InAppPurchasesService$purchaseRead$postResult$1(inAppPurchasesService, str6, purchase4, null);
                                inAppPurchasesService$purchaseRead$12.L$0 = str6;
                                inAppPurchasesService$purchaseRead$12.L$1 = null;
                                inAppPurchasesService$purchaseRead$12.L$2 = null;
                                inAppPurchasesService$purchaseRead$12.L$3 = null;
                                inAppPurchasesService$purchaseRead$12.L$4 = purchase4;
                                inAppPurchasesService$purchaseRead$12.I$0 = responseCode;
                                inAppPurchasesService$purchaseRead$12.label = 3;
                                Object Q = g0.Q(io2, inAppPurchasesService$purchaseRead$postResult$1, inAppPurchasesService$purchaseRead$12);
                                if (Q != aVar) {
                                    purchase = purchase4;
                                    obj4 = Q;
                                    asyncCallResult = (AsyncCallResult) obj4;
                                    if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                                    }
                                }
                                return aVar;
                            }
                            inAppPurchasesService.logger.log(inAppPurchasesService.tag, "purchaseRead - ok result but empty purchase");
                            mapBillingResponseToReadPurchaseResult = PurchasesService.ReadPurchaseResult.Error.UnknownError.INSTANCE;
                        } else {
                            mapBillingResponseToReadPurchaseResult = inAppPurchasesService.mapBillingResponseToReadPurchaseResult(responseCode);
                        }
                        return new AsyncCallResult.Success(mapBillingResponseToReadPurchaseResult);
                    }
                    Object obj5 = inAppPurchasesService$purchaseRead$13.L$2;
                    String str8 = (String) inAppPurchasesService$purchaseRead$13.L$1;
                    String str9 = (String) inAppPurchasesService$purchaseRead$13.L$0;
                    sn.a.g(obj4);
                    str4 = str9;
                    obj2 = obj5;
                    obj3 = obj4;
                    str3 = str8;
                } else {
                    sn.a.g(obj4);
                    i.r("purchaseRead - ", str2, inAppPurchasesService.logger, inAppPurchasesService.tag);
                    ir.i customerOrNull = ((CustomerService) inAppPurchasesService.customerService.get()).getCustomerOrNull();
                    inAppPurchasesService$purchaseRead$13.L$0 = str;
                    inAppPurchasesService$purchaseRead$13.L$1 = str2;
                    obj2 = obj;
                    inAppPurchasesService$purchaseRead$13.L$2 = obj2;
                    inAppPurchasesService$purchaseRead$13.label = 1;
                    Object w6 = r.w(customerOrNull, inAppPurchasesService$purchaseRead$13);
                    if (w6 != aVar) {
                        str3 = str2;
                        obj3 = w6;
                        str4 = str;
                    }
                    return aVar;
                }
                customer = (Customer) obj3;
                if (customer == null) {
                    str5 = customer.getId();
                } else {
                    str5 = null;
                }
                if (str5 != null) {
                    return new AsyncCallResult.Success(PurchasesService.ReadPurchaseResult.Error.ConnectionError.INSTANCE);
                }
                inAppPurchasesService.logger.log(inAppPurchasesService.tag, "purchaseRead - suspend");
                a2.b bVar = new a2.b(inAppPurchasesService, 23);
                io.elevenlabs.highlighter.d dVar2 = new io.elevenlabs.highlighter.d(26);
                io.elevenlabs.highlighter.z zVar = new io.elevenlabs.highlighter.z(10);
                InAppPurchasesService$purchaseRead$5 inAppPurchasesService$purchaseRead$5 = new InAppPurchasesService$purchaseRead$5(this, str3, str5, obj2, null);
                inAppPurchasesService$purchaseRead$13.L$0 = str4;
                inAppPurchasesService$purchaseRead$13.L$1 = null;
                inAppPurchasesService$purchaseRead$13.L$2 = null;
                inAppPurchasesService$purchaseRead$13.L$3 = null;
                inAppPurchasesService$purchaseRead$13.label = 2;
                inAppPurchasesService$purchaseRead$12 = inAppPurchasesService$purchaseRead$13;
                inAppPurchasesService = this;
                obj4 = inAppPurchasesService.withBillingClient(bVar, dVar2, zVar, inAppPurchasesService$purchaseRead$5, inAppPurchasesService$purchaseRead$12);
                if (obj4 != aVar) {
                    str6 = str4;
                    BillingClientResult billingClientResult2 = (BillingClientResult) obj4;
                    responseCode = billingClientResult2.getResponseCode();
                    Purchase purchase42 = billingClientResult2.getPurchase();
                    if (responseCode != 0) {
                    }
                    return new AsyncCallResult.Success(mapBillingResponseToReadPurchaseResult);
                }
                return aVar;
            }
        }
        inAppPurchasesService$purchaseRead$1 = new InAppPurchasesService$purchaseRead$1(inAppPurchasesService, cVar);
        InAppPurchasesService$purchaseRead$1 inAppPurchasesService$purchaseRead$132 = inAppPurchasesService$purchaseRead$1;
        Object obj42 = inAppPurchasesService$purchaseRead$132.result;
        i10 = inAppPurchasesService$purchaseRead$132.label;
        xn.a aVar3 = xn.a.f37986a;
        if (i10 == 0) {
        }
        customer = (Customer) obj3;
        if (customer == null) {
        }
        if (str5 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // io.elevenlabs.domain.services.PurchasesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object restorePurchases(c<? super AsyncCallResult<z>> cVar) {
        InAppPurchasesService$restorePurchases$1 inAppPurchasesService$restorePurchases$1;
        int i10;
        try {
            if (cVar instanceof InAppPurchasesService$restorePurchases$1) {
                inAppPurchasesService$restorePurchases$1 = (InAppPurchasesService$restorePurchases$1) cVar;
                int i11 = inAppPurchasesService$restorePurchases$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    inAppPurchasesService$restorePurchases$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = inAppPurchasesService$restorePurchases$1.result;
                    i10 = inAppPurchasesService$restorePurchases$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        Object obj2 = this.purchases.get();
                        obj2.getClass();
                        inAppPurchasesService$restorePurchases$1.label = 1;
                        Object awaitRestore = CoroutinesExtensionsCommonKt.awaitRestore((Purchases) obj2, inAppPurchasesService$restorePurchases$1);
                        xn.a aVar = xn.a.f37986a;
                        if (awaitRestore == aVar) {
                            return aVar;
                        }
                    }
                    return new AsyncCallResult.Success(z.f31622a);
                }
            }
            if (i10 == 0) {
            }
            return new AsyncCallResult.Success(z.f31622a);
        } catch (PurchasesException e10) {
            this.logger.logWarning(this.tag, "Can't syncPurchases / " + e10.getMessage(), e10);
            return new AsyncCallResult.Error(new AsyncCallResult.AsyncCallError.ApiError("get_products_error", e10.getLocalizedMessage()));
        }
        inAppPurchasesService$restorePurchases$1 = new InAppPurchasesService$restorePurchases$1(this, cVar);
        Object obj3 = inAppPurchasesService$restorePurchases$1.result;
        i10 = inAppPurchasesService$restorePurchases$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0228, code lost:
    
        if (r0 == r12) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00b9, code lost:
    
        if (r8 == r12) goto L196;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0179 A[Catch: PurchasesException -> 0x0056, PurchasesTransactionException -> 0x0059, TryCatch #2 {PurchasesTransactionException -> 0x0059, PurchasesException -> 0x0056, blocks: (B:15:0x0051, B:16:0x022b, B:22:0x0077, B:23:0x016d, B:24:0x0173, B:26:0x0179, B:30:0x018c, B:32:0x0190, B:35:0x019f, B:37:0x01a5, B:40:0x01c4, B:42:0x01d1, B:44:0x01d7, B:45:0x0204, B:48:0x01f6, B:49:0x01ab, B:51:0x01b1, B:53:0x01b8, B:55:0x01be, B:60:0x0088, B:62:0x00eb, B:63:0x00fc, B:66:0x0105, B:71:0x0115, B:77:0x0119, B:86:0x00ca), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0190 A[Catch: PurchasesException -> 0x0056, PurchasesTransactionException -> 0x0059, TryCatch #2 {PurchasesTransactionException -> 0x0059, PurchasesException -> 0x0056, blocks: (B:15:0x0051, B:16:0x022b, B:22:0x0077, B:23:0x016d, B:24:0x0173, B:26:0x0179, B:30:0x018c, B:32:0x0190, B:35:0x019f, B:37:0x01a5, B:40:0x01c4, B:42:0x01d1, B:44:0x01d7, B:45:0x0204, B:48:0x01f6, B:49:0x01ab, B:51:0x01b1, B:53:0x01b8, B:55:0x01be, B:60:0x0088, B:62:0x00eb, B:63:0x00fc, B:66:0x0105, B:71:0x0115, B:77:0x0119, B:86:0x00ca), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c4 A[Catch: PurchasesException -> 0x0056, PurchasesTransactionException -> 0x0059, TryCatch #2 {PurchasesTransactionException -> 0x0059, PurchasesException -> 0x0056, blocks: (B:15:0x0051, B:16:0x022b, B:22:0x0077, B:23:0x016d, B:24:0x0173, B:26:0x0179, B:30:0x018c, B:32:0x0190, B:35:0x019f, B:37:0x01a5, B:40:0x01c4, B:42:0x01d1, B:44:0x01d7, B:45:0x0204, B:48:0x01f6, B:49:0x01ab, B:51:0x01b1, B:53:0x01b8, B:55:0x01be, B:60:0x0088, B:62:0x00eb, B:63:0x00fc, B:66:0x0105, B:71:0x0115, B:77:0x0119, B:86:0x00ca), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d1 A[Catch: PurchasesException -> 0x0056, PurchasesTransactionException -> 0x0059, TryCatch #2 {PurchasesTransactionException -> 0x0059, PurchasesException -> 0x0056, blocks: (B:15:0x0051, B:16:0x022b, B:22:0x0077, B:23:0x016d, B:24:0x0173, B:26:0x0179, B:30:0x018c, B:32:0x0190, B:35:0x019f, B:37:0x01a5, B:40:0x01c4, B:42:0x01d1, B:44:0x01d7, B:45:0x0204, B:48:0x01f6, B:49:0x01ab, B:51:0x01b1, B:53:0x01b8, B:55:0x01be, B:60:0x0088, B:62:0x00eb, B:63:0x00fc, B:66:0x0105, B:71:0x0115, B:77:0x0119, B:86:0x00ca), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0105 A[Catch: PurchasesException -> 0x0056, PurchasesTransactionException -> 0x0059, TRY_ENTER, TryCatch #2 {PurchasesTransactionException -> 0x0059, PurchasesException -> 0x0056, blocks: (B:15:0x0051, B:16:0x022b, B:22:0x0077, B:23:0x016d, B:24:0x0173, B:26:0x0179, B:30:0x018c, B:32:0x0190, B:35:0x019f, B:37:0x01a5, B:40:0x01c4, B:42:0x01d1, B:44:0x01d7, B:45:0x0204, B:48:0x01f6, B:49:0x01ab, B:51:0x01b1, B:53:0x01b8, B:55:0x01be, B:60:0x0088, B:62:0x00eb, B:63:0x00fc, B:66:0x0105, B:71:0x0115, B:77:0x0119, B:86:0x00ca), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ca A[Catch: PurchasesException -> 0x0056, PurchasesTransactionException -> 0x0059, TRY_ENTER, TryCatch #2 {PurchasesTransactionException -> 0x0059, PurchasesException -> 0x0056, blocks: (B:15:0x0051, B:16:0x022b, B:22:0x0077, B:23:0x016d, B:24:0x0173, B:26:0x0179, B:30:0x018c, B:32:0x0190, B:35:0x019f, B:37:0x01a5, B:40:0x01c4, B:42:0x01d1, B:44:0x01d7, B:45:0x0204, B:48:0x01f6, B:49:0x01ab, B:51:0x01b1, B:53:0x01b8, B:55:0x01be, B:60:0x0088, B:62:0x00eb, B:63:0x00fc, B:66:0x0105, B:71:0x0115, B:77:0x0119, B:86:0x00ca), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a4  */
    @Override // io.elevenlabs.domain.services.PurchasesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object subscribe(String str, Object obj, boolean z6, c<? super AsyncCallResult<PurchasesService.PurchaseResult>> cVar) {
        InAppPurchasesService$subscribe$1 inAppPurchasesService$subscribe$1;
        int i10;
        String str2;
        Object obj2;
        boolean z10;
        Object auth;
        AsyncCallResult asyncCallResult;
        String str3;
        Object obj3;
        boolean z11;
        Object obj4;
        String str4;
        List list;
        Iterator it;
        Object obj5;
        StoreProduct storeProduct;
        SubscriptionOption basePlan;
        PurchaseParams build;
        try {
            if (cVar instanceof InAppPurchasesService$subscribe$1) {
                inAppPurchasesService$subscribe$1 = (InAppPurchasesService$subscribe$1) cVar;
                int i11 = inAppPurchasesService$subscribe$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    inAppPurchasesService$subscribe$1.label = i11 - Integer.MIN_VALUE;
                    InAppPurchasesService$subscribe$1 inAppPurchasesService$subscribe$12 = inAppPurchasesService$subscribe$1;
                    Object obj6 = inAppPurchasesService$subscribe$12.result;
                    i10 = inAppPurchasesService$subscribe$12.label;
                    Object obj7 = xn.a.f37986a;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    if (i10 == 4) {
                                        sn.a.g(obj6);
                                        return new AsyncCallResult.Success(new PurchasesService.PurchaseResult.Purchased(((PurchaseResult) obj6).getStoreTransaction().getOrderId()));
                                    }
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                z11 = inAppPurchasesService$subscribe$12.Z$0;
                                list = (List) inAppPurchasesService$subscribe$12.L$3;
                                obj4 = inAppPurchasesService$subscribe$12.L$1;
                                str4 = (String) inAppPurchasesService$subscribe$12.L$0;
                                sn.a.g(obj6);
                                it = ((Iterable) obj6).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj5 = it.next();
                                        if (m.c(((StoreProduct) obj5).getId(), str4)) {
                                            break;
                                        }
                                    } else {
                                        obj5 = null;
                                        break;
                                    }
                                }
                                storeProduct = (StoreProduct) obj5;
                                if (storeProduct != null) {
                                    return new AsyncCallResult.Error(new AsyncCallResult.AsyncCallError.ApiError("payment_error", "Can't find product"));
                                }
                                if (z11) {
                                    SubscriptionOptions subscriptionOptions = storeProduct.getSubscriptionOptions();
                                    if (subscriptionOptions == null || (basePlan = subscriptionOptions.getFreeTrial()) == null) {
                                        SubscriptionOptions subscriptionOptions2 = storeProduct.getSubscriptionOptions();
                                        if (subscriptionOptions2 != null) {
                                            basePlan = subscriptionOptions2.getBasePlan();
                                        }
                                        basePlan = null;
                                    }
                                    if (basePlan == null) {
                                        return new AsyncCallResult.Error(new AsyncCallResult.AsyncCallError.ApiError("payment_error", "No subscription option available"));
                                    }
                                    if (!list.isEmpty()) {
                                        obj4.getClass();
                                        build = new PurchaseParams.Builder((Activity) obj4, basePlan).oldProductId((String) o.w0(list)).googleReplacementMode(GoogleReplacementMode.CHARGE_PRORATED_PRICE).build();
                                    } else {
                                        obj4.getClass();
                                        build = new PurchaseParams.Builder((Activity) obj4, basePlan).build();
                                    }
                                    Object obj8 = this.purchases.get();
                                    obj8.getClass();
                                    inAppPurchasesService$subscribe$12.L$0 = null;
                                    inAppPurchasesService$subscribe$12.L$1 = null;
                                    inAppPurchasesService$subscribe$12.L$2 = null;
                                    inAppPurchasesService$subscribe$12.L$3 = null;
                                    inAppPurchasesService$subscribe$12.L$4 = null;
                                    inAppPurchasesService$subscribe$12.L$5 = null;
                                    inAppPurchasesService$subscribe$12.L$6 = null;
                                    inAppPurchasesService$subscribe$12.L$7 = null;
                                    inAppPurchasesService$subscribe$12.Z$0 = z11;
                                    inAppPurchasesService$subscribe$12.label = 4;
                                    obj6 = CoroutinesExtensionsCommonKt.awaitPurchase((Purchases) obj8, build, inAppPurchasesService$subscribe$12);
                                } else {
                                    SubscriptionOptions subscriptionOptions3 = storeProduct.getSubscriptionOptions();
                                    if (subscriptionOptions3 != null) {
                                        basePlan = subscriptionOptions3.getBasePlan();
                                        if (basePlan == null) {
                                        }
                                    }
                                    basePlan = null;
                                    if (basePlan == null) {
                                    }
                                }
                                return new AsyncCallResult.Success(new PurchasesService.PurchaseResult.Purchased(((PurchaseResult) obj6).getStoreTransaction().getOrderId()));
                            }
                            z11 = inAppPurchasesService$subscribe$12.Z$0;
                            Object obj9 = inAppPurchasesService$subscribe$12.L$1;
                            String str5 = (String) inAppPurchasesService$subscribe$12.L$0;
                            sn.a.g(obj6);
                            obj3 = obj9;
                            str3 = str5;
                            Set<String> activeSubscriptions = ((CustomerInfo) obj6).getActiveSubscriptions();
                            ArrayList arrayList = new ArrayList();
                            for (String str6 : activeSubscriptions) {
                                if (!wq.n.a0(str6, ":", false)) {
                                    str6 = null;
                                }
                                if (str6 != null) {
                                    arrayList.add(str6);
                                }
                            }
                            this.logger.log(this.tag, "Active subscriptions: " + arrayList);
                            String str7 = (String) wq.n.z0(str3, new String[]{":"}, 6).get(0);
                            Object obj10 = this.purchases.get();
                            obj10.getClass();
                            List H = ig.f.H(str7);
                            inAppPurchasesService$subscribe$12.L$0 = str3;
                            inAppPurchasesService$subscribe$12.L$1 = obj3;
                            inAppPurchasesService$subscribe$12.L$2 = null;
                            inAppPurchasesService$subscribe$12.L$3 = arrayList;
                            inAppPurchasesService$subscribe$12.L$4 = null;
                            inAppPurchasesService$subscribe$12.Z$0 = z11;
                            inAppPurchasesService$subscribe$12.label = 3;
                            obj6 = CoroutinesExtensionsCommonKt.awaitGetProducts$default((Purchases) obj10, H, null, inAppPurchasesService$subscribe$12, 2, null);
                            if (obj6 == obj7) {
                                obj4 = obj3;
                                str4 = str3;
                                list = arrayList;
                                it = ((Iterable) obj6).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                    }
                                }
                                storeProduct = (StoreProduct) obj5;
                                if (storeProduct != null) {
                                }
                            } else {
                                return obj7;
                            }
                        } else {
                            boolean z12 = inAppPurchasesService$subscribe$12.Z$0;
                            Object obj11 = inAppPurchasesService$subscribe$12.L$1;
                            String str8 = (String) inAppPurchasesService$subscribe$12.L$0;
                            sn.a.g(obj6);
                            auth = obj6;
                            str2 = str8;
                            z10 = z12;
                            obj2 = obj11;
                        }
                    } else {
                        sn.a.g(obj6);
                        str2 = str;
                        inAppPurchasesService$subscribe$12.L$0 = str2;
                        obj2 = obj;
                        inAppPurchasesService$subscribe$12.L$1 = obj2;
                        z10 = z6;
                        inAppPurchasesService$subscribe$12.Z$0 = z10;
                        inAppPurchasesService$subscribe$12.label = 1;
                        auth = auth(inAppPurchasesService$subscribe$12);
                    }
                    asyncCallResult = (AsyncCallResult) auth;
                    if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                        return ((AsyncCallResult.Error) asyncCallResult).cast();
                    }
                    Object obj12 = this.purchases.get();
                    obj12.getClass();
                    inAppPurchasesService$subscribe$12.L$0 = str2;
                    inAppPurchasesService$subscribe$12.L$1 = obj2;
                    inAppPurchasesService$subscribe$12.L$2 = null;
                    inAppPurchasesService$subscribe$12.Z$0 = z10;
                    inAppPurchasesService$subscribe$12.label = 2;
                    Object awaitCustomerInfo$default = CoroutinesExtensionsKt.awaitCustomerInfo$default((Purchases) obj12, null, inAppPurchasesService$subscribe$12, 1, null);
                    if (awaitCustomerInfo$default != obj7) {
                        str3 = str2;
                        obj3 = obj2;
                        obj6 = awaitCustomerInfo$default;
                        z11 = z10;
                        Set<String> activeSubscriptions2 = ((CustomerInfo) obj6).getActiveSubscriptions();
                        ArrayList arrayList2 = new ArrayList();
                        while (r0.hasNext()) {
                        }
                        this.logger.log(this.tag, "Active subscriptions: " + arrayList2);
                        String str72 = (String) wq.n.z0(str3, new String[]{":"}, 6).get(0);
                        Object obj102 = this.purchases.get();
                        obj102.getClass();
                        List H2 = ig.f.H(str72);
                        inAppPurchasesService$subscribe$12.L$0 = str3;
                        inAppPurchasesService$subscribe$12.L$1 = obj3;
                        inAppPurchasesService$subscribe$12.L$2 = null;
                        inAppPurchasesService$subscribe$12.L$3 = arrayList2;
                        inAppPurchasesService$subscribe$12.L$4 = null;
                        inAppPurchasesService$subscribe$12.Z$0 = z11;
                        inAppPurchasesService$subscribe$12.label = 3;
                        obj6 = CoroutinesExtensionsCommonKt.awaitGetProducts$default((Purchases) obj102, H2, null, inAppPurchasesService$subscribe$12, 2, null);
                        if (obj6 == obj7) {
                        }
                    } else {
                        return obj7;
                    }
                }
            }
            if (i10 == 0) {
            }
            asyncCallResult = (AsyncCallResult) auth;
            if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
            }
        } catch (PurchasesTransactionException e10) {
            if (e10.getUserCancelled()) {
                return new AsyncCallResult.Success(PurchasesService.PurchaseResult.Cancelled.INSTANCE);
            }
            return new AsyncCallResult.Error(new AsyncCallResult.AsyncCallError.ApiError("payment_error", e10.getLocalizedMessage()));
        } catch (PurchasesException e11) {
            return new AsyncCallResult.Error(new AsyncCallResult.AsyncCallError.ApiError("payment_error", e11.getLocalizedMessage()));
        }
        inAppPurchasesService$subscribe$1 = new InAppPurchasesService$subscribe$1(this, cVar);
        InAppPurchasesService$subscribe$1 inAppPurchasesService$subscribe$122 = inAppPurchasesService$subscribe$1;
        Object obj62 = inAppPurchasesService$subscribe$122.result;
        i10 = inAppPurchasesService$subscribe$122.label;
        Object obj72 = xn.a.f37986a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/payments/InAppPurchasesService$BillingClientResult;", "", "responseCode", "", FirebaseAnalytics.Event.PURCHASE, "Lcom/android/billingclient/api/Purchase;", "<init>", "(ILcom/android/billingclient/api/Purchase;)V", "getResponseCode", "()I", "getPurchase", "()Lcom/android/billingclient/api/Purchase;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "payments_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class BillingClientResult {
        private final Purchase purchase;
        private final int responseCode;

        public /* synthetic */ BillingClientResult(int i10, Purchase purchase, int i11, kotlin.jvm.internal.f fVar) {
            this(i10, (i11 & 2) != 0 ? null : purchase);
        }

        public static /* synthetic */ BillingClientResult copy$default(BillingClientResult billingClientResult, int i10, Purchase purchase, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = billingClientResult.responseCode;
            }
            if ((i11 & 2) != 0) {
                purchase = billingClientResult.purchase;
            }
            return billingClientResult.copy(i10, purchase);
        }

        /* renamed from: component1, reason: from getter */
        public final int getResponseCode() {
            return this.responseCode;
        }

        /* renamed from: component2, reason: from getter */
        public final Purchase getPurchase() {
            return this.purchase;
        }

        public final BillingClientResult copy(int responseCode, Purchase r32) {
            return new BillingClientResult(responseCode, r32);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BillingClientResult)) {
                return false;
            }
            BillingClientResult billingClientResult = (BillingClientResult) other;
            if (this.responseCode == billingClientResult.responseCode && m.c(this.purchase, billingClientResult.purchase)) {
                return true;
            }
            return false;
        }

        public final Purchase getPurchase() {
            return this.purchase;
        }

        public final int getResponseCode() {
            return this.responseCode;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = Integer.hashCode(this.responseCode) * 31;
            Purchase purchase = this.purchase;
            if (purchase == null) {
                hashCode = 0;
            } else {
                hashCode = purchase.f5162a.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "BillingClientResult(responseCode=" + this.responseCode + ", purchase=" + this.purchase + Separators.RPAREN;
        }

        public BillingClientResult(int i10, Purchase purchase) {
            this.responseCode = i10;
            this.purchase = purchase;
        }
    }

    public final <T> Object withBillingClient(ho.p pVar, c<? super AsyncCallResult<T>> cVar) {
        return withBillingClient(new io.elevenlabs.highlighter.z(11), new io.elevenlabs.highlighter.d(27), new io.elevenlabs.highlighter.z(12), new InAppPurchasesService$withBillingClient$8(pVar, null), cVar);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.elevenlabs.payments.InAppPurchasesService$3", f = "InAppPurchasesService.kt", l = {174}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.payments.InAppPurchasesService$3 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends yn.i implements ho.p {
        int label;

        public AnonymousClass3(c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            return new AnonymousClass3(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, c<? super z> cVar) {
            return ((AnonymousClass3) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
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
                ir.i customerOrNull = ((CustomerService) InAppPurchasesService.this.customerService.get()).getCustomerOrNull();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InAppPurchasesService.this);
                this.label = 1;
                Object collect = customerOrNull.collect(anonymousClass1, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.payments.InAppPurchasesService$3$1 */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass1<T> implements j {
            final /* synthetic */ InAppPurchasesService this$0;

            public AnonymousClass1(InAppPurchasesService inAppPurchasesService) {
                this.this$0 = inAppPurchasesService;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(2:11|12)(2:14|15))(5:16|17|18|19|20))(3:22|(4:24|(1:26)|19|20)(2:29|(0)(1:12))|28)|31|32|19|20))|33|6|7|(0)(0)|31|32|19|20) */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
            
                if (com.revenuecat.purchases.CoroutinesExtensionsKt.awaitLogOut((com.revenuecat.purchases.Purchases) r10, r0) == r5) goto L69;
             */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Customer customer, c<? super z> cVar) {
                InAppPurchasesService$3$1$emit$1 inAppPurchasesService$3$1$emit$1;
                int i10;
                if (cVar instanceof InAppPurchasesService$3$1$emit$1) {
                    inAppPurchasesService$3$1$emit$1 = (InAppPurchasesService$3$1$emit$1) cVar;
                    int i11 = inAppPurchasesService$3$1$emit$1.label;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        inAppPurchasesService$3$1$emit$1.label = i11 - Integer.MIN_VALUE;
                        Object obj = inAppPurchasesService$3$1$emit$1.result;
                        i10 = inAppPurchasesService$3$1$emit$1.label;
                        z zVar = z.f31622a;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    sn.a.g(obj);
                                    return zVar;
                                }
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            sn.a.g(obj);
                            this.this$0.isAuthorized.set(false);
                            this.this$0.customerCanTrial = false;
                            this.this$0.rcEligibleForTrial = false;
                            this.this$0.logger.log(this.this$0.tag, "Customer signed out - resetting trial eligibility to false");
                            this.this$0.updateTrialEligibility();
                            return zVar;
                        }
                        sn.a.g(obj);
                        InAppPurchasesService inAppPurchasesService = this.this$0;
                        xn.a aVar = xn.a.f37986a;
                        if (customer != null) {
                            inAppPurchasesService.customerCanTrial = customer.getCanTrial();
                            this.this$0.logger.log(this.this$0.tag, "Customer updated - customerCanTrial=" + this.this$0.customerCanTrial);
                            this.this$0.updateTrialEligibility();
                            InAppPurchasesService inAppPurchasesService2 = this.this$0;
                            inAppPurchasesService$3$1$emit$1.L$0 = null;
                            inAppPurchasesService$3$1$emit$1.label = 2;
                            if (inAppPurchasesService2.authCustomer(customer, inAppPurchasesService$3$1$emit$1) != aVar) {
                                return zVar;
                            }
                        } else {
                            if (!((Purchases) inAppPurchasesService.purchases.get()).isAnonymous()) {
                                Object obj2 = this.this$0.purchases.get();
                                obj2.getClass();
                                inAppPurchasesService$3$1$emit$1.L$0 = null;
                                inAppPurchasesService$3$1$emit$1.label = 1;
                            }
                            this.this$0.isAuthorized.set(false);
                            this.this$0.customerCanTrial = false;
                            this.this$0.rcEligibleForTrial = false;
                            this.this$0.logger.log(this.this$0.tag, "Customer signed out - resetting trial eligibility to false");
                            this.this$0.updateTrialEligibility();
                            return zVar;
                        }
                        return aVar;
                        i.r("Can't sign out from RC / ", e.getMessage(), this.this$0.logger, this.this$0.tag);
                        this.this$0.isAuthorized.set(false);
                        this.this$0.customerCanTrial = false;
                        this.this$0.rcEligibleForTrial = false;
                        this.this$0.logger.log(this.this$0.tag, "Customer signed out - resetting trial eligibility to false");
                        this.this$0.updateTrialEligibility();
                        return zVar;
                    }
                }
                inAppPurchasesService$3$1$emit$1 = new InAppPurchasesService$3$1$emit$1(this, cVar);
                Object obj3 = inAppPurchasesService$3$1$emit$1.result;
                i10 = inAppPurchasesService$3$1$emit$1.label;
                z zVar2 = z.f31622a;
                if (i10 == 0) {
                }
                i.r("Can't sign out from RC / ", e.getMessage(), this.this$0.logger, this.this$0.tag);
                this.this$0.isAuthorized.set(false);
                this.this$0.customerCanTrial = false;
                this.this$0.rcEligibleForTrial = false;
                this.this$0.logger.log(this.this$0.tag, "Customer signed out - resetting trial eligibility to false");
                this.this$0.updateTrialEligibility();
                return zVar2;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, c cVar) {
                return emit((Customer) obj, (c<? super z>) cVar);
            }
        }
    }
}
