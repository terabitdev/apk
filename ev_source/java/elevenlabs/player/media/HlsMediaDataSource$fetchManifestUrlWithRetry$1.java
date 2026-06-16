package io.elevenlabs.player.media;

import android.gov.nist.core.Separators;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import fr.j2;
import ho.p;
import io.elevenlabs.domain.ApiException;
import io.elevenlabs.domain.ApiExceptionKt;
import io.elevenlabs.domain.Logger;
import java.io.IOException;
import kotlin.Metadata;
import p.n;
import sn.z;
import wn.c;
import xn.a;
import xq.b;
import xq.d;
import xq.g;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.player.media.HlsMediaDataSource$fetchManifestUrlWithRetry$1", f = "HlsMediaDataSource.kt", l = {130, 152}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "", "<anonymous>", "(Lfr/d0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class HlsMediaDataSource$fetchManifestUrlWithRetry$1 extends i implements p {
    final /* synthetic */ String $fileNumber;
    final /* synthetic */ int $maxRetries;
    final /* synthetic */ String $readId;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ HlsMediaDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HlsMediaDataSource$fetchManifestUrlWithRetry$1(int i10, HlsMediaDataSource hlsMediaDataSource, String str, String str2, c<? super HlsMediaDataSource$fetchManifestUrlWithRetry$1> cVar) {
        super(2, cVar);
        this.$maxRetries = i10;
        this.this$0 = hlsMediaDataSource;
        this.$readId = str;
        this.$fileNumber = str2;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new HlsMediaDataSource$fetchManifestUrlWithRetry$1(this.$maxRetries, this.this$0, this.$readId, this.$fileNumber, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super String> cVar) {
        return ((HlsMediaDataSource$fetchManifestUrlWithRetry$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0192 -> B:6:0x0194). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x019d -> B:7:0x0196). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i10;
        HlsMediaDataSource hlsMediaDataSource;
        String str;
        String str2;
        kotlin.jvm.internal.d0 d0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.d0 d0Var2;
        Exception e10;
        Logger logger;
        int i15;
        int i16;
        int i17;
        String str3;
        String str4;
        ApiException e11;
        Logger logger2;
        Logger logger3;
        kotlin.jvm.internal.d0 d0Var3;
        j2 e12;
        Logger logger4;
        Logger logger5;
        int i18 = this.label;
        c cVar = null;
        int i19 = 0;
        a aVar = a.f37986a;
        if (i18 != 0) {
            if (i18 != 1) {
                if (i18 == 2) {
                    i16 = this.I$2;
                    i17 = this.I$1;
                    int i20 = this.I$0;
                    str3 = (String) this.L$3;
                    str4 = (String) this.L$2;
                    HlsMediaDataSource hlsMediaDataSource2 = (HlsMediaDataSource) this.L$1;
                    d0Var3 = (kotlin.jvm.internal.d0) this.L$0;
                    sn.a.g(obj);
                    char c5 = 2;
                    hlsMediaDataSource = hlsMediaDataSource2;
                    i10 = i20;
                    str = str4;
                    i12 = i17;
                    d0Var = d0Var3;
                    str2 = str3;
                    i11 = i16 + 1;
                    cVar = null;
                    i19 = 0;
                    if (i11 >= i10) {
                        try {
                        } catch (j2 e13) {
                            e12 = e13;
                            d0Var2 = d0Var;
                            i13 = i11;
                            i14 = 0;
                            logger4 = hlsMediaDataSource.logger;
                            i15 = i14;
                            logger4.log("HlsMediaDataSource", "Manifest URL fetch timeout on attempt " + (i11 + 1));
                            d0Var2.f20559a = new IOException("Timeout fetching manifest URL", e12);
                            i16 = i13;
                            i17 = i12;
                            str3 = str2;
                            str4 = str;
                            d0Var3 = d0Var2;
                            int i21 = i15;
                            if (i11 < i17 - 1) {
                                xq.a aVar2 = b.f38124b;
                                long n2 = g.n((i11 + 1) * 500, d.MILLISECONDS);
                                this.L$0 = d0Var3;
                                this.L$1 = hlsMediaDataSource;
                                this.L$2 = str4;
                                this.L$3 = str3;
                                this.I$0 = i10;
                                this.I$1 = i17;
                                this.I$2 = i16;
                                this.I$3 = i11;
                                this.I$4 = i21;
                                c5 = 2;
                                this.label = 2;
                                if (g0.n(n2, this) != aVar) {
                                    i20 = i10;
                                    hlsMediaDataSource2 = hlsMediaDataSource;
                                    hlsMediaDataSource = hlsMediaDataSource2;
                                    i10 = i20;
                                    str = str4;
                                    i12 = i17;
                                    d0Var = d0Var3;
                                    str2 = str3;
                                    i11 = i16 + 1;
                                    cVar = null;
                                    i19 = 0;
                                    if (i11 >= i10) {
                                    }
                                }
                                return aVar;
                            }
                            c5 = 2;
                            str = str4;
                            i12 = i17;
                            d0Var = d0Var3;
                            str2 = str3;
                            i11 = i16 + 1;
                            cVar = null;
                            i19 = 0;
                            if (i11 >= i10) {
                            }
                        } catch (ApiException e14) {
                            e11 = e14;
                            d0Var2 = d0Var;
                            i13 = i11;
                            i14 = 0;
                            if (ApiExceptionKt.getPERMANENT_API_ERRORS().contains(e11.getCode())) {
                                logger3 = hlsMediaDataSource.logger;
                                i15 = i14;
                                logger3.log("HlsMediaDataSource", "Transient API error: " + e11.getCode() + " - will retry");
                                d0Var2.f20559a = e11;
                                i16 = i13;
                                i17 = i12;
                                str3 = str2;
                                str4 = str;
                                d0Var3 = d0Var2;
                                int i212 = i15;
                                if (i11 < i17 - 1) {
                                }
                            } else {
                                logger2 = hlsMediaDataSource.logger;
                                logger2.log("HlsMediaDataSource", "Permanent API error: " + e11.getCode() + " - NOT retrying");
                                throw e11;
                            }
                        } catch (Exception e15) {
                            e10 = e15;
                            d0Var2 = d0Var;
                            i13 = i11;
                            i14 = 0;
                            logger = hlsMediaDataSource.logger;
                            i15 = i14;
                            logger.log("HlsMediaDataSource", n.h(i11 + 1, "Error fetching HLS manifest on attempt ", ": ", e10.getMessage()));
                            d0Var2.f20559a = e10;
                            i16 = i13;
                            i17 = i12;
                            str3 = str2;
                            str4 = str;
                            i11 = i11;
                            d0Var3 = d0Var2;
                            int i2122 = i15;
                            if (i11 < i17 - 1) {
                            }
                        }
                        logger5 = hlsMediaDataSource.logger;
                        logger5.log("HlsMediaDataSource", "Fetching HLS manifest URL (attempt " + (i11 + 1) + Separators.SLASH + i12 + Separators.RPAREN);
                        xq.a aVar3 = b.f38124b;
                        long n10 = g.n(10, d.SECONDS);
                        HlsMediaDataSource$fetchManifestUrlWithRetry$1$1$1 hlsMediaDataSource$fetchManifestUrlWithRetry$1$1$1 = new HlsMediaDataSource$fetchManifestUrlWithRetry$1$1$1(hlsMediaDataSource, str, str2, cVar);
                        this.L$0 = d0Var;
                        this.L$1 = hlsMediaDataSource;
                        this.L$2 = str;
                        this.L$3 = str2;
                        this.I$0 = i10;
                        this.I$1 = i12;
                        this.I$2 = i11;
                        this.I$3 = i11;
                        this.I$4 = i19;
                        this.label = 1;
                        Object R = g0.R(g0.N(n10), hlsMediaDataSource$fetchManifestUrlWithRetry$1$1$1, this);
                        if (R != aVar) {
                            return R;
                        }
                        return aVar;
                    }
                    throw new IOException(com.google.android.gms.internal.play_billing.b.j(this.$maxRetries, "Failed to fetch manifest URL after ", " attempts"), (Throwable) d0Var.f20559a);
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = this.I$4;
            i11 = this.I$3;
            i13 = this.I$2;
            i12 = this.I$1;
            i10 = this.I$0;
            str2 = (String) this.L$3;
            str = (String) this.L$2;
            hlsMediaDataSource = (HlsMediaDataSource) this.L$1;
            kotlin.jvm.internal.d0 d0Var4 = (kotlin.jvm.internal.d0) this.L$0;
            try {
                sn.a.g(obj);
                return obj;
            } catch (j2 e16) {
                e12 = e16;
                d0Var2 = d0Var4;
                logger4 = hlsMediaDataSource.logger;
                i15 = i14;
                logger4.log("HlsMediaDataSource", "Manifest URL fetch timeout on attempt " + (i11 + 1));
                d0Var2.f20559a = new IOException("Timeout fetching manifest URL", e12);
                i16 = i13;
                i17 = i12;
                str3 = str2;
                str4 = str;
                d0Var3 = d0Var2;
                int i21222 = i15;
                if (i11 < i17 - 1) {
                }
            } catch (ApiException e17) {
                e11 = e17;
                d0Var2 = d0Var4;
                if (ApiExceptionKt.getPERMANENT_API_ERRORS().contains(e11.getCode())) {
                }
            } catch (Exception e18) {
                e10 = e18;
                d0Var2 = d0Var4;
                logger = hlsMediaDataSource.logger;
                i15 = i14;
                logger.log("HlsMediaDataSource", n.h(i11 + 1, "Error fetching HLS manifest on attempt ", ": ", e10.getMessage()));
                d0Var2.f20559a = e10;
                i16 = i13;
                i17 = i12;
                str3 = str2;
                str4 = str;
                i11 = i11;
                d0Var3 = d0Var2;
                int i212222 = i15;
                if (i11 < i17 - 1) {
                }
            }
        } else {
            sn.a.g(obj);
            Object obj2 = new Object();
            int i22 = this.$maxRetries;
            i10 = i22;
            hlsMediaDataSource = this.this$0;
            str = this.$readId;
            str2 = this.$fileNumber;
            d0Var = obj2;
            i11 = 0;
            i12 = i10;
            if (i11 >= i10) {
            }
        }
    }
}
