package io.elevenlabs.readerapp.services;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.provider.Settings;
import com.google.protobuf.c6;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import fr.g0;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.domain.model.ExplorePricingType;
import io.elevenlabs.domain.model.ReadDetailsResponse;
import io.elevenlabs.domain.model.User;
import io.elevenlabs.domain.services.AgentContextService;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.LocaleService;
import io.elevenlabs.domain.services.ReadsService;
import io.livekit.android.room.SignalClient;
import ir.i;
import ir.r;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.l;
import sn.m;
import t2.u;
import tn.o;
import tn.t;
import un.e;
import wn.c;
import wq.n;
import xq.b;
import xq.d;
import xq.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\f\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J1\u0010\u001e\u001a\u00020\u001d*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120!2\b\u0010 \u001a\u0004\u0018\u00010\u0012H\u0096@¢\u0006\u0004\b\"\u0010\u0016J\u0010\u0010#\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010+¨\u0006-"}, d2 = {"Lio/elevenlabs/readerapp/services/AgentContextServiceImpl;", "Lio/elevenlabs/domain/services/AgentContextService;", "Lio/elevenlabs/domain/services/AuthService;", "authService", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "Lio/elevenlabs/domain/services/LocaleService;", "localeService", "Lio/elevenlabs/domain/Configuration;", "configuration", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Landroid/content/Context;", "context", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/services/AuthService;Lio/elevenlabs/domain/services/CustomerService;Lio/elevenlabs/domain/services/LocaleService;Lio/elevenlabs/domain/Configuration;Lio/elevenlabs/domain/services/ReadsService;Landroid/content/Context;Lio/elevenlabs/domain/Logger;)V", "", "readId", "", "isUltraPricing", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "screenSize", "()Ljava/lang/String;", "deviceName", "", SubscriberAttributeKt.JSON_NAME_KEY, "value", "Lsn/z;", "putIfNotBlank", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "purchaseIdentifier", "", "buildDynamicVariables", "buildUltraReadsContext", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/services/AuthService;", "Lio/elevenlabs/domain/services/CustomerService;", "Lio/elevenlabs/domain/services/LocaleService;", "Lio/elevenlabs/domain/Configuration;", "Lio/elevenlabs/domain/services/ReadsService;", "Landroid/content/Context;", "Lio/elevenlabs/domain/Logger;", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AgentContextServiceImpl implements AgentContextService {
    private static final long LIBRARY_LOOKUP_TIMEOUT;
    private static final String NO_ULTRA_TITLES_SENTENCE = "User has no Ultra-only content in their library.";
    private static final String TAG = "AgentContextServiceImpl";
    private static final long ULTRA_LOOKUP_PER_ITEM_TIMEOUT;
    private static final long ULTRA_LOOKUP_TOTAL_TIMEOUT;
    private static final int ULTRA_RECENT_READ_LIMIT = 5;
    private final AuthService authService;
    private final Configuration configuration;
    private final Context context;
    private final CustomerService customerService;
    private final LocaleService localeService;
    private final Logger logger;
    private final ReadsService readsService;
    public static final int $stable = 8;

    static {
        xq.a aVar = b.f38124b;
        d dVar = d.SECONDS;
        LIBRARY_LOOKUP_TIMEOUT = g.n(2, dVar);
        ULTRA_LOOKUP_PER_ITEM_TIMEOUT = g.n(3, dVar);
        ULTRA_LOOKUP_TOTAL_TIMEOUT = g.n(6, dVar);
    }

    public AgentContextServiceImpl(AuthService authService, CustomerService customerService, LocaleService localeService, Configuration configuration, ReadsService readsService, Context context, Logger logger) {
        authService.getClass();
        customerService.getClass();
        localeService.getClass();
        configuration.getClass();
        readsService.getClass();
        context.getClass();
        logger.getClass();
        this.authService = authService;
        this.customerService = customerService;
        this.localeService = localeService;
        this.configuration = configuration;
        this.readsService = readsService;
        this.context = context;
        this.logger = logger;
    }

    private final String deviceName() {
        Object lVar;
        String str = null;
        if (Build.VERSION.SDK_INT >= 25) {
            try {
                lVar = Settings.Global.getString(this.context.getContentResolver(), "device_name");
            } catch (Throwable th) {
                lVar = new l(th);
            }
            if (lVar instanceof l) {
                lVar = null;
            }
            String str2 = (String) lVar;
            if (str2 != null && !n.m0(str2)) {
                str = str2;
            }
        }
        if (str == null) {
            return n.L0(Build.MANUFACTURER + Separators.SP + Build.MODEL).toString();
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isUltraPricing(String str, c<? super Boolean> cVar) {
        AgentContextServiceImpl$isUltraPricing$1 agentContextServiceImpl$isUltraPricing$1;
        int i10;
        AsyncCallResult asyncCallResult;
        if (cVar instanceof AgentContextServiceImpl$isUltraPricing$1) {
            agentContextServiceImpl$isUltraPricing$1 = (AgentContextServiceImpl$isUltraPricing$1) cVar;
            int i11 = agentContextServiceImpl$isUltraPricing$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                agentContextServiceImpl$isUltraPricing$1.label = i11 - Integer.MIN_VALUE;
                Object obj = agentContextServiceImpl$isUltraPricing$1.result;
                i10 = agentContextServiceImpl$isUltraPricing$1.label;
                boolean z6 = true;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    long j4 = ULTRA_LOOKUP_PER_ITEM_TIMEOUT;
                    AgentContextServiceImpl$isUltraPricing$result$1 agentContextServiceImpl$isUltraPricing$result$1 = new AgentContextServiceImpl$isUltraPricing$result$1(this, str, null);
                    agentContextServiceImpl$isUltraPricing$1.L$0 = null;
                    agentContextServiceImpl$isUltraPricing$1.label = 1;
                    obj = g0.S(g0.N(j4), agentContextServiceImpl$isUltraPricing$result$1, agentContextServiceImpl$isUltraPricing$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                asyncCallResult = (AsyncCallResult) obj;
                if ((asyncCallResult instanceof AsyncCallResult.Success) || ((ReadDetailsResponse) ((AsyncCallResult.Success) asyncCallResult).getData()).getPricingType() != ExplorePricingType.Ultra) {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            }
        }
        agentContextServiceImpl$isUltraPricing$1 = new AgentContextServiceImpl$isUltraPricing$1(this, cVar);
        Object obj2 = agentContextServiceImpl$isUltraPricing$1.result;
        i10 = agentContextServiceImpl$isUltraPricing$1.label;
        boolean z62 = true;
        if (i10 == 0) {
        }
        asyncCallResult = (AsyncCallResult) obj2;
        if (asyncCallResult instanceof AsyncCallResult.Success) {
        }
        z62 = false;
        return Boolean.valueOf(z62);
    }

    private final void putIfNotBlank(Map<String, String> map, String str, String str2) {
        if (str2 != null && !n.m0(str2)) {
            map.put(str, str2);
        }
    }

    private final String screenSize() {
        float f10 = this.context.getResources().getDisplayMetrics().density;
        if (f10 <= u.P) {
            return "";
        }
        return ((int) (r0.widthPixels / f10)) + "x" + ((int) (r0.heightPixels / f10));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(2:3|(14:5|6|7|(1:(1:(16:11|12|13|14|15|(1:17)|18|(1:20)|21|(1:23)(1:33)|24|(1:26)|27|(1:29)|30|31)(2:37|38))(2:39|40))(3:58|59|(2:61|52))|41|42|(1:44)|45|(1:47)|48|49|50|(14:53|14|15|(0)|18|(0)|21|(0)(0)|24|(0)|27|(0)|30|31)|52))|64|6|7|(0)(0)|41|42|(0)|45|(0)|48|49|50|(0)|52|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b7, code lost:
    
        r0 = r14;
        r14 = r15;
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0051, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006e, code lost:
    
        r15 = new sn.l(r15);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // io.elevenlabs.domain.services.AgentContextService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object buildDynamicVariables(String str, c<? super Map<String, String>> cVar) {
        AgentContextServiceImpl$buildDynamicVariables$1 agentContextServiceImpl$buildDynamicVariables$1;
        int i10;
        xn.a aVar;
        Object lVar;
        Throwable a10;
        String str2;
        User user;
        Object w6;
        Object lVar2;
        Throwable a11;
        Customer customer;
        String str3;
        if (cVar instanceof AgentContextServiceImpl$buildDynamicVariables$1) {
            agentContextServiceImpl$buildDynamicVariables$1 = (AgentContextServiceImpl$buildDynamicVariables$1) cVar;
            int i11 = agentContextServiceImpl$buildDynamicVariables$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                agentContextServiceImpl$buildDynamicVariables$1.label = i11 - Integer.MIN_VALUE;
                Object obj = agentContextServiceImpl$buildDynamicVariables$1.result;
                i10 = agentContextServiceImpl$buildDynamicVariables$1.label;
                String str4 = null;
                aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            user = (User) agentContextServiceImpl$buildDynamicVariables$1.L$1;
                            str2 = (String) agentContextServiceImpl$buildDynamicVariables$1.L$0;
                            try {
                                sn.a.g(obj);
                                lVar2 = (Customer) obj;
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                lVar2 = new l(th2);
                                a11 = m.a(lVar2);
                                if (a11 != null) {
                                }
                                if (lVar2 instanceof l) {
                                }
                                customer = (Customer) lVar2;
                                e eVar = new e();
                                putIfNotBlank(eVar, SignalClient.CONNECT_QUERY_DEVICE_MODEL, Build.MODEL);
                                putIfNotBlank(eVar, "device_name", deviceName());
                                eVar.put("system_name", "Android");
                                putIfNotBlank(eVar, "system_version", Build.VERSION.RELEASE);
                                putIfNotBlank(eVar, "device_identifier", Build.DEVICE);
                                putIfNotBlank(eVar, "app_version", this.configuration.getAppVersionName());
                                eVar.put("app_build", String.valueOf(this.configuration.getAppVersionCode()));
                                putIfNotBlank(eVar, "locale", this.localeService.getLocale());
                                putIfNotBlank(eVar, "language", this.localeService.getLanguage());
                                putIfNotBlank(eVar, "timezone", TimeZone.getDefault().getID());
                                putIfNotBlank(eVar, "screen_size", screenSize());
                                if (user == null) {
                                }
                                putIfNotBlank(eVar, "user_id", str3);
                                if (user != null) {
                                }
                                putIfNotBlank(eVar, "user_email", str4);
                                putIfNotBlank(eVar, "purchase_identifier", str2);
                                if (customer != null) {
                                }
                                e b10 = eVar.b();
                                this.logger.log(TAG, "buildDynamicVariables -> keys=" + b10.keySet());
                                return b10;
                            }
                            a11 = m.a(lVar2);
                            if (a11 != null) {
                                this.logger.logWarning(TAG, "getCustomerOrNull() failed: " + a11.getMessage(), a11);
                            }
                            if (lVar2 instanceof l) {
                                lVar2 = null;
                            }
                            customer = (Customer) lVar2;
                            e eVar2 = new e();
                            putIfNotBlank(eVar2, SignalClient.CONNECT_QUERY_DEVICE_MODEL, Build.MODEL);
                            putIfNotBlank(eVar2, "device_name", deviceName());
                            eVar2.put("system_name", "Android");
                            putIfNotBlank(eVar2, "system_version", Build.VERSION.RELEASE);
                            putIfNotBlank(eVar2, "device_identifier", Build.DEVICE);
                            putIfNotBlank(eVar2, "app_version", this.configuration.getAppVersionName());
                            eVar2.put("app_build", String.valueOf(this.configuration.getAppVersionCode()));
                            putIfNotBlank(eVar2, "locale", this.localeService.getLocale());
                            putIfNotBlank(eVar2, "language", this.localeService.getLanguage());
                            putIfNotBlank(eVar2, "timezone", TimeZone.getDefault().getID());
                            putIfNotBlank(eVar2, "screen_size", screenSize());
                            if (user == null) {
                                str3 = user.getId();
                            } else {
                                str3 = null;
                            }
                            putIfNotBlank(eVar2, "user_id", str3);
                            if (user != null) {
                                str4 = user.getEmail();
                            }
                            putIfNotBlank(eVar2, "user_email", str4);
                            putIfNotBlank(eVar2, "purchase_identifier", str2);
                            if (customer != null) {
                                putIfNotBlank(eVar2, "subscription_plan", customer.getPlan());
                                eVar2.put("is_paid_plan", String.valueOf(!customer.isFreeUser()));
                                putIfNotBlank(eVar2, "billing_period", customer.getBillingPeriod());
                                eVar2.put("can_upgrade", String.valueOf(customer.getCanUpgrade()));
                                eVar2.put("current_credits", String.valueOf(customer.getCurrentCredits()));
                            }
                            e b102 = eVar2.b();
                            this.logger.log(TAG, "buildDynamicVariables -> keys=" + b102.keySet());
                            return b102;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) agentContextServiceImpl$buildDynamicVariables$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    i userOrNull = this.authService.userOrNull();
                    agentContextServiceImpl$buildDynamicVariables$1.L$0 = str;
                    agentContextServiceImpl$buildDynamicVariables$1.L$1 = null;
                    agentContextServiceImpl$buildDynamicVariables$1.I$0 = 0;
                    agentContextServiceImpl$buildDynamicVariables$1.label = 1;
                    obj = r.w(userOrNull, agentContextServiceImpl$buildDynamicVariables$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                lVar = (User) obj;
                a10 = m.a(lVar);
                if (a10 != null) {
                    this.logger.logWarning(TAG, "userOrNull() failed: " + a10.getMessage(), a10);
                }
                if (lVar instanceof l) {
                    lVar = null;
                }
                User user2 = (User) lVar;
                i customerOrNull = this.customerService.getCustomerOrNull();
                agentContextServiceImpl$buildDynamicVariables$1.L$0 = str;
                agentContextServiceImpl$buildDynamicVariables$1.L$1 = user2;
                agentContextServiceImpl$buildDynamicVariables$1.L$2 = null;
                agentContextServiceImpl$buildDynamicVariables$1.I$0 = 0;
                agentContextServiceImpl$buildDynamicVariables$1.label = 2;
                w6 = r.w(customerOrNull, agentContextServiceImpl$buildDynamicVariables$1);
                if (w6 != aVar) {
                    str2 = str;
                    user = user2;
                    obj = w6;
                    lVar2 = (Customer) obj;
                    a11 = m.a(lVar2);
                    if (a11 != null) {
                    }
                    if (lVar2 instanceof l) {
                    }
                    customer = (Customer) lVar2;
                    e eVar22 = new e();
                    putIfNotBlank(eVar22, SignalClient.CONNECT_QUERY_DEVICE_MODEL, Build.MODEL);
                    putIfNotBlank(eVar22, "device_name", deviceName());
                    eVar22.put("system_name", "Android");
                    putIfNotBlank(eVar22, "system_version", Build.VERSION.RELEASE);
                    putIfNotBlank(eVar22, "device_identifier", Build.DEVICE);
                    putIfNotBlank(eVar22, "app_version", this.configuration.getAppVersionName());
                    eVar22.put("app_build", String.valueOf(this.configuration.getAppVersionCode()));
                    putIfNotBlank(eVar22, "locale", this.localeService.getLocale());
                    putIfNotBlank(eVar22, "language", this.localeService.getLanguage());
                    putIfNotBlank(eVar22, "timezone", TimeZone.getDefault().getID());
                    putIfNotBlank(eVar22, "screen_size", screenSize());
                    if (user == null) {
                    }
                    putIfNotBlank(eVar22, "user_id", str3);
                    if (user != null) {
                    }
                    putIfNotBlank(eVar22, "user_email", str4);
                    putIfNotBlank(eVar22, "purchase_identifier", str2);
                    if (customer != null) {
                    }
                    e b1022 = eVar22.b();
                    this.logger.log(TAG, "buildDynamicVariables -> keys=" + b1022.keySet());
                    return b1022;
                }
                return aVar;
            }
        }
        agentContextServiceImpl$buildDynamicVariables$1 = new AgentContextServiceImpl$buildDynamicVariables$1(this, cVar);
        Object obj2 = agentContextServiceImpl$buildDynamicVariables$1.result;
        i10 = agentContextServiceImpl$buildDynamicVariables$1.label;
        String str42 = null;
        aVar = xn.a.f37986a;
        if (i10 == 0) {
        }
        lVar = (User) obj2;
        a10 = m.a(lVar);
        if (a10 != null) {
        }
        if (lVar instanceof l) {
        }
        User user22 = (User) lVar;
        i customerOrNull2 = this.customerService.getCustomerOrNull();
        agentContextServiceImpl$buildDynamicVariables$1.L$0 = str;
        agentContextServiceImpl$buildDynamicVariables$1.L$1 = user22;
        agentContextServiceImpl$buildDynamicVariables$1.L$2 = null;
        agentContextServiceImpl$buildDynamicVariables$1.I$0 = 0;
        agentContextServiceImpl$buildDynamicVariables$1.label = 2;
        w6 = r.w(customerOrNull2, agentContextServiceImpl$buildDynamicVariables$1);
        if (w6 != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        if (r12 == r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        if (r12 == r8) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.util.List] */
    @Override // io.elevenlabs.domain.services.AgentContextService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object buildUltraReadsContext(c<? super String> cVar) {
        AgentContextServiceImpl$buildUltraReadsContext$1 agentContextServiceImpl$buildUltraReadsContext$1;
        int i10;
        List list;
        t tVar;
        if (cVar instanceof AgentContextServiceImpl$buildUltraReadsContext$1) {
            agentContextServiceImpl$buildUltraReadsContext$1 = (AgentContextServiceImpl$buildUltraReadsContext$1) cVar;
            int i11 = agentContextServiceImpl$buildUltraReadsContext$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                agentContextServiceImpl$buildUltraReadsContext$1.label = i11 - Integer.MIN_VALUE;
                Object obj = agentContextServiceImpl$buildUltraReadsContext$1.result;
                i10 = agentContextServiceImpl$buildUltraReadsContext$1.label;
                t tVar2 = t.f33547a;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            ?? r12 = (List) obj;
                            if (r12 == 0) {
                                tVar = tVar2;
                            } else {
                                tVar = r12;
                            }
                            if (tVar.isEmpty()) {
                                this.logger.log(TAG, "buildUltraReadsContext -> no ultra titles among recent reads");
                                return NO_ULTRA_TITLES_SENTENCE;
                            }
                            return p.n.h(tVar.size(), "User has ", " Ultra-only title(s) in their library: ", o.E0(tVar, ", ", null, null, null, 62));
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    long j4 = LIBRARY_LOOKUP_TIMEOUT;
                    AgentContextServiceImpl$buildUltraReadsContext$recent$1 agentContextServiceImpl$buildUltraReadsContext$recent$1 = new AgentContextServiceImpl$buildUltraReadsContext$recent$1(this, null);
                    agentContextServiceImpl$buildUltraReadsContext$1.label = 1;
                    obj = g0.S(g0.N(j4), agentContextServiceImpl$buildUltraReadsContext$recent$1, agentContextServiceImpl$buildUltraReadsContext$1);
                }
                list = (List) obj;
                if (list == null) {
                    list = tVar2;
                }
                if (!list.isEmpty()) {
                    this.logger.log(TAG, "buildUltraReadsContext -> empty library");
                    return NO_ULTRA_TITLES_SENTENCE;
                }
                long j10 = ULTRA_LOOKUP_TOTAL_TIMEOUT;
                AgentContextServiceImpl$buildUltraReadsContext$ultraTitles$1 agentContextServiceImpl$buildUltraReadsContext$ultraTitles$1 = new AgentContextServiceImpl$buildUltraReadsContext$ultraTitles$1(list, this, null);
                agentContextServiceImpl$buildUltraReadsContext$1.L$0 = null;
                agentContextServiceImpl$buildUltraReadsContext$1.label = 2;
                obj = g0.S(g0.N(j10), agentContextServiceImpl$buildUltraReadsContext$ultraTitles$1, agentContextServiceImpl$buildUltraReadsContext$1);
            }
        }
        agentContextServiceImpl$buildUltraReadsContext$1 = new AgentContextServiceImpl$buildUltraReadsContext$1(this, cVar);
        Object obj2 = agentContextServiceImpl$buildUltraReadsContext$1.result;
        i10 = agentContextServiceImpl$buildUltraReadsContext$1.label;
        t tVar22 = t.f33547a;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        list = (List) obj2;
        if (list == null) {
        }
        if (!list.isEmpty()) {
        }
    }
}
