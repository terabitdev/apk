package io.elevenlabs.readerapp.usecase;

import android.app.Activity;
import com.google.protobuf.c6;
import fr.g0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.readerapp.usecase.ValidateHCaptchaResult;
import ir.i;
import ir.r;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.l;
import sn.m;
import wn.c;
import xq.d;
import xq.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/readerapp/usecase/AnonCaptchaTokenServiceImpl;", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", "Lio/elevenlabs/readerapp/usecase/CurrentActivityProvider;", "currentActivityProvider", "", "siteKey", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/readerapp/usecase/CurrentActivityProvider;Ljava/lang/String;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/CustomerService;Lio/elevenlabs/domain/Logger;)V", "Lsn/z;", "confirmTokenAccepted", "()V", "getToken", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/readerapp/usecase/CurrentActivityProvider;", "Ljava/lang/String;", "Lio/elevenlabs/domain/DispatcherFactory;", "Lio/elevenlabs/domain/services/CustomerService;", "Lio/elevenlabs/domain/Logger;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "tokenConfirmed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AnonCaptchaTokenServiceImpl implements AnonCaptchaTokenService {
    public static final int $stable = 8;
    private final CurrentActivityProvider currentActivityProvider;
    private final CustomerService customerService;
    private final DispatcherFactory dispatcherFactory;
    private final Logger logger;
    private final String siteKey;
    private final AtomicBoolean tokenConfirmed;

    public AnonCaptchaTokenServiceImpl(CurrentActivityProvider currentActivityProvider, String str, DispatcherFactory dispatcherFactory, CustomerService customerService, Logger logger) {
        currentActivityProvider.getClass();
        str.getClass();
        dispatcherFactory.getClass();
        customerService.getClass();
        logger.getClass();
        this.currentActivityProvider = currentActivityProvider;
        this.siteKey = str;
        this.dispatcherFactory = dispatcherFactory;
        this.customerService = customerService;
        this.logger = logger;
        this.tokenConfirmed = new AtomicBoolean(false);
    }

    @Override // io.elevenlabs.domain.services.AnonCaptchaTokenService
    public void confirmTokenAccepted() {
        if (this.tokenConfirmed.compareAndSet(false, true)) {
            this.logger.log("AnonCaptchaTokenService", "confirmTokenAccepted - skipping captcha for the rest of the session");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:3|(11:5|6|7|(1:(1:(5:11|12|13|14|(2:16|17)(2:19|(2:21|22)(1:(2:24|25)(2:26|27))))(2:29|30))(2:31|32))(2:55|(1:57)(2:58|(2:60|53)))|33|34|(1:36)|37|(1:39)|40|(2:46|(2:48|49)(2:50|51))(2:44|45)))|67|6|7|(0)(0)|33|34|(0)|37|(0)|40|(1:42)|46|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e5, code lost:
    
        if (r0 == r8) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x004e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0074, code lost:
    
        r0 = new sn.l(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x003d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00eb, code lost:
    
        r20.logger.logWarning("AnonCaptchaTokenService", "getToken - unexpected error: " + r0.getMessage(), r0);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // io.elevenlabs.domain.services.AnonCaptchaTokenService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getToken(c<? super String> cVar) {
        AnonCaptchaTokenServiceImpl$getToken$1 anonCaptchaTokenServiceImpl$getToken$1;
        int i10;
        Object lVar;
        Throwable a10;
        Customer customer;
        Activity currentActivity;
        if (cVar instanceof AnonCaptchaTokenServiceImpl$getToken$1) {
            anonCaptchaTokenServiceImpl$getToken$1 = (AnonCaptchaTokenServiceImpl$getToken$1) cVar;
            int i11 = anonCaptchaTokenServiceImpl$getToken$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonCaptchaTokenServiceImpl$getToken$1.label = i11 - Integer.MIN_VALUE;
                Object obj = anonCaptchaTokenServiceImpl$getToken$1.result;
                i10 = anonCaptchaTokenServiceImpl$getToken$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            ValidateHCaptchaResult validateHCaptchaResult = (ValidateHCaptchaResult) obj;
                            if (validateHCaptchaResult instanceof ValidateHCaptchaResult.Success) {
                                this.logger.log("AnonCaptchaTokenService", "getToken - hCaptcha token obtained successfully");
                                return ((ValidateHCaptchaResult.Success) validateHCaptchaResult).getToken();
                            }
                            if (validateHCaptchaResult instanceof ValidateHCaptchaResult.Error) {
                                Logger.logWarning$default(this.logger, "AnonCaptchaTokenService", "getToken - hCaptcha failed: ".concat(((ValidateHCaptchaResult.Error) validateHCaptchaResult).getException().getMessage()), null, 4, null);
                                return null;
                            }
                            if (validateHCaptchaResult == null) {
                                Logger.logWarning$default(this.logger, "AnonCaptchaTokenService", "getToken - hCaptcha returned no result (timeout or error)", null, 4, null);
                                return null;
                            }
                            c6.p();
                            return null;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    if (this.tokenConfirmed.get()) {
                        return null;
                    }
                    i customerOrNull = this.customerService.getCustomerOrNull();
                    anonCaptchaTokenServiceImpl$getToken$1.L$0 = null;
                    anonCaptchaTokenServiceImpl$getToken$1.I$0 = 0;
                    anonCaptchaTokenServiceImpl$getToken$1.label = 1;
                    obj = r.w(customerOrNull, anonCaptchaTokenServiceImpl$getToken$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                lVar = (Customer) obj;
                a10 = m.a(lVar);
                if (a10 != null) {
                    this.logger.logWarning("AnonCaptchaTokenService", "getCustomerOrNull() failed: " + a10.getMessage(), a10);
                }
                if (lVar instanceof l) {
                    lVar = null;
                }
                customer = (Customer) lVar;
                if (customer == null && !customer.isFreeUser()) {
                    this.logger.log("AnonCaptchaTokenService", "getToken - paid plan, skipping captcha");
                    return null;
                }
                currentActivity = this.currentActivityProvider.getCurrentActivity();
                Logger logger = this.logger;
                if (currentActivity != null) {
                    Logger.logWarning$default(logger, "AnonCaptchaTokenService", "getToken - no current Activity available; skipping captcha", null, 4, null);
                    return null;
                }
                logger.log("AnonCaptchaTokenService", "getToken - requesting invisible hCaptcha token");
                xq.a aVar2 = xq.b.f38124b;
                long n2 = g.n(10, d.SECONDS);
                AnonCaptchaTokenServiceImpl$getToken$result$1 anonCaptchaTokenServiceImpl$getToken$result$1 = new AnonCaptchaTokenServiceImpl$getToken$result$1(this, currentActivity, null);
                anonCaptchaTokenServiceImpl$getToken$1.L$0 = null;
                anonCaptchaTokenServiceImpl$getToken$1.L$1 = null;
                anonCaptchaTokenServiceImpl$getToken$1.label = 2;
                obj = g0.S(g0.N(n2), anonCaptchaTokenServiceImpl$getToken$result$1, anonCaptchaTokenServiceImpl$getToken$1);
            }
        }
        anonCaptchaTokenServiceImpl$getToken$1 = new AnonCaptchaTokenServiceImpl$getToken$1(this, cVar);
        Object obj2 = anonCaptchaTokenServiceImpl$getToken$1.result;
        i10 = anonCaptchaTokenServiceImpl$getToken$1.label;
        xn.a aVar3 = xn.a.f37986a;
        if (i10 == 0) {
        }
        lVar = (Customer) obj2;
        a10 = m.a(lVar);
        if (a10 != null) {
        }
        if (lVar instanceof l) {
        }
        customer = (Customer) lVar;
        if (customer == null) {
        }
        currentActivity = this.currentActivityProvider.getCurrentActivity();
        Logger logger2 = this.logger;
        if (currentActivity != null) {
        }
    }
}
