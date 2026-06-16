package io.livekit.android.room;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.SystemClock;
import androidx.room.m0;
import com.google.protobuf.c6;
import fr.g0;
import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import io.livekit.android.room.RoomException;
import io.livekit.android.util.OkHttpCallExtKt;
import java.io.Closeable;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import sn.a;
import vr.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001.B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0086@¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lio/livekit/android/room/RegionUrlProvider;", "", "Ljava/net/URI;", "serverUrl", "", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "Lokhttp3/OkHttpClient;", "okHttpClient", "Lvr/c;", "json", "<init>", "(Ljava/net/URI;Ljava/lang/String;Lokhttp3/OkHttpClient;Lvr/c;)V", "", "isLKCloud", "()Z", "getNextBestRegionUrl", "(Lwn/c;)Ljava/lang/Object;", "Lio/livekit/android/room/RegionSettings;", "fetchRegionSettings", "Lsn/z;", "clearAttemptedRegions", "()V", "regionSettings", "setServerReportedRegions", "(Lio/livekit/android/room/RegionSettings;)V", "Ljava/net/URI;", "getServerUrl", "()Ljava/net/URI;", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "Lokhttp3/OkHttpClient;", "Lvr/c;", "Lio/livekit/android/room/RegionSettings;", "", "lastUpdateAt", "J", "", "settingsCacheTimeMs", TokenNames.I, "", "Lio/livekit/android/room/RegionInfo;", "attemptedRegions", "Ljava/util/Set;", "Factory", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RegionUrlProvider {
    private Set<RegionInfo> attemptedRegions;
    private final c json;
    private long lastUpdateAt;
    private final OkHttpClient okHttpClient;
    private RegionSettings regionSettings;
    private final URI serverUrl;
    private int settingsCacheTimeMs;
    private String token;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lio/livekit/android/room/RegionUrlProvider$Factory;", "", "create", "Lio/livekit/android/room/RegionUrlProvider;", "serverUrl", "Ljava/net/URI;", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Factory {
        RegionUrlProvider create(URI serverUrl, String token);
    }

    public RegionUrlProvider(URI uri, String str, OkHttpClient okHttpClient, c cVar) {
        uri.getClass();
        str.getClass();
        okHttpClient.getClass();
        cVar.getClass();
        this.serverUrl = uri;
        this.token = str;
        this.okHttpClient = okHttpClient;
        this.json = cVar;
        this.settingsCacheTimeMs = 30000;
        this.attemptedRegions = new LinkedHashSet();
    }

    public final void clearAttemptedRegions() {
        this.attemptedRegions.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008a A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:12:0x0081, B:14:0x008a, B:16:0x008e, B:25:0x00c0, B:26:0x00dd), top: B:11:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0 A[Catch: all -> 0x0093, TRY_ENTER, TryCatch #0 {all -> 0x0093, blocks: (B:12:0x0081, B:14:0x008a, B:16:0x008e, B:25:0x00c0, B:26:0x00dd), top: B:11:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchRegionSettings(wn.c<? super RegionSettings> cVar) {
        RegionUrlProvider$fetchRegionSettings$1 regionUrlProvider$fetchRegionSettings$1;
        int i10;
        RegionUrlProvider regionUrlProvider;
        Response response;
        String str;
        try {
            if (cVar instanceof RegionUrlProvider$fetchRegionSettings$1) {
                regionUrlProvider$fetchRegionSettings$1 = (RegionUrlProvider$fetchRegionSettings$1) cVar;
                int i11 = regionUrlProvider$fetchRegionSettings$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    regionUrlProvider$fetchRegionSettings$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = regionUrlProvider$fetchRegionSettings$1.result;
                    i10 = regionUrlProvider$fetchRegionSettings$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            regionUrlProvider = (RegionUrlProvider) regionUrlProvider$fetchRegionSettings$1.L$0;
                            a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        a.g(obj);
                        Request.Builder builder = new Request.Builder();
                        String uri = RegionUrlProviderKt.getCloudConfigUrl(this.serverUrl, "/regions").toString();
                        uri.getClass();
                        builder.f(uri);
                        builder.c(SIPHeaderNames.AUTHORIZATION, "Bearer " + this.token);
                        Request request = new Request(builder);
                        OkHttpClient okHttpClient = this.okHttpClient;
                        okHttpClient.getClass();
                        RealCall realCall = new RealCall(okHttpClient, request, false);
                        regionUrlProvider$fetchRegionSettings$1.L$0 = this;
                        regionUrlProvider$fetchRegionSettings$1.label = 1;
                        obj = OkHttpCallExtKt.executeAsync(realCall, regionUrlProvider$fetchRegionSettings$1);
                        xn.a aVar = xn.a.f37986a;
                        if (obj == aVar) {
                            return aVar;
                        }
                        regionUrlProvider = this;
                    }
                    Closeable closeable = (Closeable) obj;
                    response = (Response) closeable;
                    if (!response.F0) {
                        ResponseBody responseBody = response.Y;
                        if (responseBody != null) {
                            str = responseBody.E();
                        } else {
                            str = null;
                        }
                        m0.o(closeable, null);
                        if (str != null) {
                            c cVar2 = regionUrlProvider.json;
                            cVar2.getClass();
                            Object b10 = cVar2.b(str, RegionSettings.INSTANCE.serializer());
                            regionUrlProvider.regionSettings = (RegionSettings) b10;
                            regionUrlProvider.lastUpdateAt = SystemClock.elapsedRealtime();
                            return b10;
                        }
                        throw new RoomException.ConnectException("Could not fetch region settings: empty response body!", null, 2, null);
                    }
                    throw new RoomException.ConnectException("Could not fetch region settings: " + response.f25426d + ' ' + response.f25425c, null, 2, null);
                }
            }
            response = (Response) closeable;
            if (!response.F0) {
            }
        } finally {
        }
        regionUrlProvider$fetchRegionSettings$1 = new RegionUrlProvider$fetchRegionSettings$1(this, cVar);
        Object obj2 = regionUrlProvider$fetchRegionSettings$1.result;
        i10 = regionUrlProvider$fetchRegionSettings$1.label;
        if (i10 == 0) {
        }
        Closeable closeable2 = (Closeable) obj2;
    }

    public final Object getNextBestRegionUrl(wn.c<? super String> cVar) {
        return g0.l(new RegionUrlProvider$getNextBestRegionUrl$2(this, null), cVar);
    }

    public final URI getServerUrl() {
        return this.serverUrl;
    }

    public final String getToken() {
        return this.token;
    }

    public final boolean isLKCloud() {
        return RegionUrlProviderKt.isLKCloud(this.serverUrl);
    }

    public final void setServerReportedRegions(RegionSettings regionSettings) {
        regionSettings.getClass();
        this.regionSettings = regionSettings;
        this.lastUpdateAt = SystemClock.elapsedRealtime();
    }

    public final void setToken(String str) {
        str.getClass();
        this.token = str;
    }
}
