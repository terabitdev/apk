package io.elevenlabs.payments;

import android.gov.nist.core.Separators;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.domain.model.UserConfigRequest;
import io.elevenlabs.domain.services.UserConfigService;
import ir.r;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import sn.z;
import wn.c;
import yn.e;
import yn.i;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.payments.StoreCountryCodeRecordingServiceImpl$recordCountryCode$1", f = "StoreCountryCodeRecordingServiceImpl.kt", l = {88, 90}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class StoreCountryCodeRecordingServiceImpl$recordCountryCode$1 extends i implements p {
    final /* synthetic */ String $countryCode;
    Object L$0;
    int label;
    final /* synthetic */ StoreCountryCodeRecordingServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreCountryCodeRecordingServiceImpl$recordCountryCode$1(StoreCountryCodeRecordingServiceImpl storeCountryCodeRecordingServiceImpl, String str, c<? super StoreCountryCodeRecordingServiceImpl$recordCountryCode$1> cVar) {
        super(2, cVar);
        this.this$0 = storeCountryCodeRecordingServiceImpl;
        this.$countryCode = str;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new StoreCountryCodeRecordingServiceImpl$recordCountryCode$1(this.this$0, this.$countryCode, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((StoreCountryCodeRecordingServiceImpl$recordCountryCode$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        if (r5.saveAsync(r7, r21) == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        if (r1 == r6) goto L17;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        UserConfigService userConfigService;
        Object u6;
        UserConfig userConfig;
        Logger logger;
        UserConfigService userConfigService2;
        Logger logger2;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    userConfig = (UserConfig) this.L$0;
                    sn.a.g(obj);
                    logger2 = this.this$0.logger;
                    String str = this.$countryCode;
                    String storeCountryCode = userConfig.getStoreCountryCode();
                    if (storeCountryCode == null) {
                        storeCountryCode = "null";
                    }
                    logger2.log("StoreCountryCodeRecordingService", h.c("recordCountryCode - countryCode=", str, " - country code saved (changed from ", storeCountryCode, Separators.RPAREN));
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
            u6 = obj;
        } else {
            sn.a.g(obj);
            userConfigService = this.this$0.userConfigService;
            ir.i config = userConfigService.getConfig();
            this.label = 1;
            u6 = r.u(config, this);
        }
        userConfig = (UserConfig) u6;
        boolean c5 = m.c(userConfig.getStoreCountryCode(), this.$countryCode);
        StoreCountryCodeRecordingServiceImpl storeCountryCodeRecordingServiceImpl = this.this$0;
        if (!c5) {
            userConfigService2 = storeCountryCodeRecordingServiceImpl.userConfigService;
            UserConfigRequest userConfigRequest = new UserConfigRequest(null, null, null, null, null, null, null, null, this.$countryCode, null, null, 1791, null);
            this.L$0 = userConfig;
            this.label = 2;
        } else {
            logger = storeCountryCodeRecordingServiceImpl.logger;
            logger.log("StoreCountryCodeRecordingService", "recordCountryCode - countryCode=" + this.$countryCode + " - country code unchanged");
            return z.f31622a;
        }
    }
}
