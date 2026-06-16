package io.elevenlabs.player.media;

import a2.a0;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.net.Uri;
import c8.c;
import c8.g;
import c8.h;
import c8.m;
import c8.p;
import com.google.firebase.perf.util.Constants;
import io.elevenlabs.domain.ApiException;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.StreamingService;
import io.elevenlabs.readerapp.ui.components.MetaStatKeys;
import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.n;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lio/elevenlabs/player/media/ReadsDataSource;", "Lc8/c;", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/services/StreamingService;", "streamingService", "<init>", "(Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/services/StreamingService;)V", "Lc8/p;", "dataSpec", "", "open", "(Lc8/p;)J", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "", "target", "", "offset", MetaStatKeys.KEY_LENGTH, "read", "([BII)I", "Lsn/z;", "close", "()V", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/services/StreamingService;", "currentByteStream", "[B", "currentPosition", TokenNames.I, "remainingBytes", "Lio/elevenlabs/domain/services/StreamingService$StreamingSession;", "streamingSession", "Lio/elevenlabs/domain/services/StreamingService$StreamingSession;", "Companion", "Factory", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadsDataSource extends c {
    private static final String TAG = "ReadsDataSource";
    private byte[] currentByteStream;
    private int currentPosition;
    private final Logger logger;
    private int remainingBytes;
    private final StreamingService streamingService;
    private StreamingService.StreamingSession streamingSession;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lio/elevenlabs/player/media/ReadsDataSource$Factory;", "Lc8/g;", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/services/StreamingService;", "streamingService", "<init>", "(Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/services/StreamingService;)V", "Lc8/h;", "createDataSource", "()Lc8/h;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/services/StreamingService;", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Factory implements g {
        private final Logger logger;
        private final StreamingService streamingService;

        public Factory(Logger logger, StreamingService streamingService) {
            logger.getClass();
            streamingService.getClass();
            this.logger = logger;
            this.streamingService = streamingService;
        }

        @Override // c8.g
        public h createDataSource() {
            return new ReadsDataSource(this.logger, this.streamingService);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadsDataSource(Logger logger, StreamingService streamingService) {
        super(true);
        logger.getClass();
        streamingService.getClass();
        this.logger = logger;
        this.streamingService = streamingService;
    }

    public static /* synthetic */ String b(ReadsDataSource readsDataSource) {
        return read$lambda$0(readsDataSource);
    }

    public static final String read$lambda$0(ReadsDataSource readsDataSource) {
        Integer num;
        byte[] bArr = readsDataSource.currentByteStream;
        if (bArr != null) {
            num = Integer.valueOf(bArr.hashCode());
        } else {
            num = null;
        }
        return "Consuming audio: " + num;
    }

    @Override // c8.h
    public void close() {
        StreamingService.StreamingSession streamingSession = this.streamingSession;
        if (streamingSession != null) {
            streamingSession.close();
        }
    }

    @Override // c8.h
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // c8.h
    public Uri getUri() {
        String uri;
        StreamingService.StreamingSession streamingSession = this.streamingSession;
        if (streamingSession != null && (uri = streamingSession.getUri()) != null) {
            return Uri.parse(uri);
        }
        return null;
    }

    @Override // c8.h
    public long open(p dataSpec) {
        long j4;
        Long Z;
        dataSpec.getClass();
        Uri uri = dataSpec.f4887a;
        StreamingService.StreamingSession streamingSession = this.streamingSession;
        if (streamingSession != null) {
            streamingSession.close();
        }
        transferInitializing(dataSpec);
        String queryParameter = uri.getQueryParameter("offset");
        if (queryParameter != null && (Z = u.Z(queryParameter)) != null) {
            j4 = Z.longValue();
        } else {
            j4 = 0;
        }
        String queryParameter2 = uri.getQueryParameter("read_id");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        StreamingService streamingService = this.streamingService;
        String uri2 = uri.toString();
        uri2.getClass();
        this.streamingSession = streamingService.open(uri2, j4, queryParameter2);
        transferStarted(dataSpec);
        return -1L;
    }

    @Override // w7.m
    public int read(byte[] target, int offset, int r92) {
        byte[] bArr;
        target.getClass();
        StreamingService.StreamingSession streamingSession = this.streamingSession;
        int i10 = 0;
        Exception exc = null;
        if ((streamingSession != null && streamingSession.hasMoreBytes()) || this.remainingBytes > 0) {
            if (this.currentByteStream == null) {
                if (streamingSession != null) {
                    bArr = streamingSession.getNextChunk();
                } else {
                    bArr = null;
                }
                this.currentByteStream = bArr;
                this.logger.verbose(TAG, new a0(this, 27));
                this.currentPosition = 0;
                byte[] bArr2 = this.currentByteStream;
                if (bArr2 != null) {
                    i10 = bArr2.length;
                }
                this.remainingBytes = i10;
            }
            bytesTransferred(this.remainingBytes);
            int min = Math.min(r92, this.remainingBytes);
            byte[] bArr3 = this.currentByteStream;
            if (bArr3 != null) {
                int i11 = this.currentPosition;
                n.s0(bArr3, offset, target, i11, i11 + min);
            }
            this.currentPosition += min;
            int i12 = this.remainingBytes - min;
            this.remainingBytes = i12;
            if (i12 == 0) {
                this.currentByteStream = null;
            }
            return min;
        }
        if (streamingSession != null && streamingSession.hasEnded()) {
            transferEnded();
            return -1;
        }
        if (streamingSession != null) {
            exc = streamingSession.getError();
        }
        if (exc == null) {
            return 0;
        }
        if (!(exc instanceof UnknownHostException) && !(exc instanceof ConnectException)) {
            if (exc instanceof ApiException) {
                ApiException apiException = (ApiException) exc;
                this.logger.log(TAG, "ApiException: code=" + apiException.getCode());
                String code = apiException.getCode();
                int hashCode = code.hashCode();
                if (hashCode == -1741584579 ? !code.equals("voice_design_free_not_allowed") : hashCode == -1165796127 ? !code.equals("insufficient_premium_books_credits") : !(hashCode == -260601762 && code.equals("insufficient_credits"))) {
                    throw new m(apiException.getLocalizedMessage(), exc, 2004);
                }
                throw new m(apiException.getLocalizedMessage(), exc, -103);
            }
            throw new m(exc.getLocalizedMessage(), exc, Constants.MAX_URL_LENGTH);
        }
        throw new m(((IOException) exc).getLocalizedMessage(), exc, 2001);
    }
}
