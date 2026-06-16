package io.elevenlabs.player.media;

import android.net.Uri;
import c8.a0;
import c8.c;
import c8.c0;
import c8.g;
import c8.h;
import c8.o;
import c8.p;
import com.google.protobuf.c6;
import d8.e;
import d8.v;
import defpackage.f;
import fr.g0;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.ConfigurationKt;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.MediaManifestService;
import io.elevenlabs.readerapp.ui.components.MetaStatKeys;
import j2.l;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.i;
import wq.b;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00020\u0001:\u00020/B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lio/elevenlabs/player/media/HlsMediaDataSource;", "Lc8/c;", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/services/MediaManifestService;", "mediaManifestService", "Ld8/v;", "simpleCache", "", "userAgent", "<init>", "(Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/services/MediaManifestService;Ld8/v;Ljava/lang/String;)V", "readId", "fileNumber", "", "maxRetries", "fetchManifestUrlWithRetry", "(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", "Lc8/p;", "dataSpec", "", "open", "(Lc8/p;)J", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "", "target", "offset", MetaStatKeys.KEY_LENGTH, "read", "([BII)I", "Lsn/z;", "close", "()V", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/services/MediaManifestService;", "Ld8/v;", "Ljava/lang/String;", "Lc8/h;", "delegate", "Lc8/h;", "currentUri", "Landroid/net/Uri;", "", "manifestCache", "Ljava/util/Map;", "Companion", "Factory", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class HlsMediaDataSource extends c {
    private static final String TAG = "HlsMediaDataSource";
    private Uri currentUri;
    private h delegate;
    private final Logger logger;
    private final Map<String, String> manifestCache;
    private final MediaManifestService mediaManifestService;
    private final v simpleCache;
    private final String userAgent;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/player/media/HlsMediaDataSource$Factory;", "Lc8/g;", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/services/MediaManifestService;", "mediaManifestService", "Ld8/v;", "simpleCache", "Lio/elevenlabs/domain/Configuration;", "configuration", "<init>", "(Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/services/MediaManifestService;Ld8/v;Lio/elevenlabs/domain/Configuration;)V", "Lc8/h;", "createDataSource", "()Lc8/h;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/services/MediaManifestService;", "Ld8/v;", "Lio/elevenlabs/domain/Configuration;", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Factory implements g {
        private final Configuration configuration;
        private final Logger logger;
        private final MediaManifestService mediaManifestService;
        private final v simpleCache;

        public Factory(Logger logger, MediaManifestService mediaManifestService, v vVar, Configuration configuration) {
            logger.getClass();
            mediaManifestService.getClass();
            vVar.getClass();
            configuration.getClass();
            this.logger = logger;
            this.mediaManifestService = mediaManifestService;
            this.simpleCache = vVar;
            this.configuration = configuration;
        }

        @Override // c8.g
        public h createDataSource() {
            return new HlsMediaDataSource(this.logger, this.mediaManifestService, this.simpleCache, ConfigurationKt.getHttpUserAgent(this.configuration));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HlsMediaDataSource(Logger logger, MediaManifestService mediaManifestService, v vVar, String str) {
        super(true);
        logger.getClass();
        mediaManifestService.getClass();
        vVar.getClass();
        str.getClass();
        this.logger = logger;
        this.mediaManifestService = mediaManifestService;
        this.simpleCache = vVar;
        this.userAgent = str;
        this.manifestCache = new LinkedHashMap();
    }

    private final String fetchManifestUrlWithRetry(String readId, String fileNumber, int maxRetries) {
        return (String) g0.I(i.f37087a, new HlsMediaDataSource$fetchManifestUrlWithRetry$1(maxRetries, this, readId, fileNumber, null));
    }

    public static /* synthetic */ String fetchManifestUrlWithRetry$default(HlsMediaDataSource hlsMediaDataSource, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 2;
        }
        return hlsMediaDataSource.fetchManifestUrlWithRetry(str, str2, i10);
    }

    @Override // c8.h
    public void close() {
        this.logger.log(TAG, "close");
        h hVar = this.delegate;
        if (hVar != null) {
            hVar.close();
        }
        this.delegate = null;
        this.currentUri = null;
    }

    @Override // c8.h
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // c8.h
    public Uri getUri() {
        Uri uri;
        h hVar = this.delegate;
        if (hVar != null && (uri = hVar.getUri()) != null) {
            return uri;
        }
        return this.currentUri;
    }

    @Override // c8.h
    public long open(p dataSpec) {
        Uri uri;
        c0 c0Var;
        byte[] bArr;
        dataSpec.getClass();
        Logger logger = this.logger;
        Uri uri2 = dataSpec.f4887a;
        logger.log(TAG, "open: " + uri2);
        uri2.getClass();
        this.currentUri = uri2;
        String uri3 = uri2.toString();
        uri3.getClass();
        boolean a02 = n.a0(uri3, "manifest-url", false);
        if (a02) {
            String queryParameter = uri2.getQueryParameter("read_id");
            if (queryParameter != null) {
                String queryParameter2 = uri2.getQueryParameter("file_number");
                if (queryParameter2 != null) {
                    String j4 = f.j(queryParameter, ":", queryParameter2);
                    String str = this.manifestCache.get(j4);
                    if (str == null) {
                        str = fetchManifestUrlWithRetry$default(this, queryParameter, queryParameter2, 0, 4, null);
                        this.manifestCache.put(j4, str);
                    }
                    this.logger.log(TAG, "Using HLS manifest URL: " + str);
                    uri = Uri.parse(str);
                } else {
                    c6.t("Missing file_number");
                    return 0L;
                }
            } else {
                c6.t("Missing read_id");
                return 0L;
            }
        } else {
            uri = uri2;
        }
        l lVar = new l(9);
        String str2 = this.userAgent;
        v vVar = this.simpleCache;
        c8.v vVar2 = new c8.v(str2, 15000, 30000, true, lVar);
        vVar.getClass();
        e eVar = new e(vVar, vVar2, new c(false), new d8.c(vVar), 2);
        this.delegate = eVar;
        o a10 = dataSpec.a();
        a10.f4877a = uri;
        p a11 = a10.a();
        try {
            transferInitializing(a11);
            long open = eVar.open(a11);
            transferStarted(a11);
            return open;
        } catch (a0 e10) {
            String str3 = null;
            if (e10 instanceof c0) {
                c0Var = (c0) e10;
            } else {
                c0Var = null;
            }
            if (c0Var != null && (bArr = c0Var.f4824e) != null) {
                str3 = n.J0(500, new String(bArr, b.f37231a));
            }
            this.logger.log(TAG, f.k("HTTP error opening data source: ", e10.getMessage(), ", body: ", str3));
            if (a02) {
                String queryParameter3 = uri2.getQueryParameter("read_id");
                String queryParameter4 = uri2.getQueryParameter("file_number");
                if (queryParameter3 != null && queryParameter4 != null) {
                    this.manifestCache.remove(queryParameter3 + ":" + queryParameter4);
                }
            }
            throw e10;
        } catch (IOException e11) {
            ib.i.r("IO error opening data source: ", e11.getMessage(), this.logger, TAG);
            throw e11;
        }
    }

    @Override // w7.m
    public int read(byte[] target, int offset, int length) {
        target.getClass();
        h hVar = this.delegate;
        if (hVar == null) {
            return -1;
        }
        int read = hVar.read(target, offset, length);
        if (read > 0) {
            bytesTransferred(read);
        }
        return read;
    }
}
