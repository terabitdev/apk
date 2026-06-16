package io.elevenlabs.data.api.interceptors;

import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.util.Base64;
import defpackage.f;
import fm.d;
import io.elevenlabs.domain.CertificateMismatchReporter;
import io.elevenlabs.domain.Logger;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kd.a;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.Handshake;
import okhttp3.Interceptor;
import okhttp3.Response;
import tn.o;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/data/api/interceptors/CertificateValidationInterceptor;", "Lokhttp3/Interceptor;", "reporter", "Lio/elevenlabs/domain/CertificateMismatchReporter;", "logger", "Lio/elevenlabs/domain/Logger;", "<init>", "(Lio/elevenlabs/domain/CertificateMismatchReporter;Lio/elevenlabs/domain/Logger;)V", "reported", "Ljava/util/concurrent/atomic/AtomicBoolean;", "intercept", "Lokhttp3/Response;", ReferencesHeader.CHAIN, "Lokhttp3/Interceptor$Chain;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CertificateValidationInterceptor implements Interceptor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<String> EXPECTED_HASHES = a.T("sha256/OdSlmQD9NWJh4EbcOHBxkhygPwNSwA9Q91eounfbcoE=");
    private static final String TAG = "CertificateValidationInterceptor";
    private final Logger logger;
    private final AtomicBoolean reported;
    private final CertificateMismatchReporter reporter;

    public CertificateValidationInterceptor(CertificateMismatchReporter certificateMismatchReporter, Logger logger) {
        certificateMismatchReporter.getClass();
        logger.getClass();
        this.reporter = certificateMismatchReporter;
        this.logger = logger;
        this.reported = new AtomicBoolean(false);
    }

    public static final CharSequence intercept$lambda$1(X509Certificate x509Certificate) {
        x509Certificate.getClass();
        return android.gov.nist.javax.sip.header.a.n(x509Certificate.getSubjectX500Principal().getName(), " [", INSTANCE.sha256SpkiHash(x509Certificate), "]");
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain r10) {
        Handshake handshake;
        List a10;
        r10.getClass();
        Response a11 = r10.a(r10.getF25665e());
        try {
            String str = r10.getF25665e().f25399a.f25307d;
            if (u.N(str, "elevenlabs.io", false) && (handshake = a11.f25427e) != null && (a10 = handshake.a()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : a10) {
                    if (obj instanceof X509Certificate) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (EXPECTED_HASHES.contains(INSTANCE.sha256SpkiHash((X509Certificate) it.next()))) {
                            break;
                        }
                    }
                }
                if (this.reported.compareAndSet(false, true)) {
                    String E0 = o.E0(arrayList, " -> ", null, null, new d(10), 30);
                    Logger.logWarning$default(this.logger, TAG, "Unexpected cert chain for " + str + ": " + E0, null, 4, null);
                    this.reporter.report(str, E0);
                }
            }
            return a11;
        } catch (Exception e10) {
            Logger.logWarning$default(this.logger, TAG, f.i("Certificate validation check failed: ", e10.getMessage()), null, 4, null);
            return a11;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/data/api/interceptors/CertificateValidationInterceptor$Companion;", "", "<init>", "()V", "TAG", "", "EXPECTED_HASHES", "", "sha256SpkiHash", "cert", "Ljava/security/cert/X509Certificate;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final String sha256SpkiHash(X509Certificate cert) {
            return f.i("sha256/", Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(cert.getPublicKey().getEncoded()), 2));
        }

        private Companion() {
        }
    }
}
