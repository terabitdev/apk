package io.elevenlabs.player.di;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import ek.c;
import g8.d0;
import g8.h;
import g8.p1;
import g8.s1;
import h8.q;
import h8.w;
import i8.t0;
import i8.v;
import io.elevenlabs.domain.ApiException;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.player.ExchangeKt;
import io.elevenlabs.player.drm.AxinomDrmProvider;
import io.elevenlabs.player.media.DynamicLoadControl;
import io.elevenlabs.player.media.HlsMediaDataSource;
import io.elevenlabs.player.media.MediaItemCreator;
import io.elevenlabs.player.media.ReadsDataSource;
import j8.r;
import j8.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.WebrtcBuildVersion;
import r8.b1;
import r8.g0;
import t8.f;
import tn.a0;
import tn.o;
import tn.p;
import tn.y;
import v8.e;
import v8.i;
import v8.j;
import v8.k;
import w7.h1;
import w7.j0;
import w7.m0;
import w7.r0;
import w7.u0;
import wq.n;
import wq.t;
import wq.u;
import x8.i0;
import xq.d;
import xq.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lio/elevenlabs/player/di/PlayerServiceModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lg8/s1;", "renderersFactory", "Lr8/g0;", "mediaSourceFactory", "Lio/elevenlabs/player/media/DynamicLoadControl;", "dynamicLoadControl", "Lw7/h1;", "providePlayer", "(Landroid/content/Context;Lg8/s1;Lr8/g0;Lio/elevenlabs/player/media/DynamicLoadControl;)Lw7/h1;", "provideRenderersFactory", "(Landroid/content/Context;)Lg8/s1;", "Lio/elevenlabs/player/drm/AxinomDrmProvider;", "axinomDrmProvider", "Lj8/s;", "provideDrmSessionManagerProvider", "(Lio/elevenlabs/player/drm/AxinomDrmProvider;)Lj8/s;", "Lio/elevenlabs/player/media/ReadsDataSource$Factory;", "readsDataSource", "Lio/elevenlabs/player/media/HlsMediaDataSource$Factory;", "hlsDataSource", "drmProvider", "Lio/elevenlabs/player/media/MediaItemCreator;", "mediaItemCreator", "provideMediaSourceFactory", "(Lio/elevenlabs/player/media/ReadsDataSource$Factory;Lio/elevenlabs/player/media/HlsMediaDataSource$Factory;Lj8/s;Lio/elevenlabs/player/media/MediaItemCreator;)Lr8/g0;", "Lg8/h;", "provideDefaultLoadControl", "()Lg8/h;", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PlayerServiceModule {
    public static final PlayerServiceModule INSTANCE = new PlayerServiceModule();

    private PlayerServiceModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r provideDrmSessionManagerProvider$lambda$0(AxinomDrmProvider axinomDrmProvider, r0 r0Var) {
        String str;
        j0 j0Var;
        boolean z6;
        String string;
        r0Var.getClass();
        String str2 = r0Var.f36578a;
        str2.getClass();
        u0 u0Var = r0Var.f36581d;
        Bundle bundle = u0Var.J;
        if (bundle == null || (str = ExchangeKt.getAudioFileNumber(bundle)) == null) {
            str = "001";
        }
        m0 m0Var = r0Var.f36579b;
        byte[] bArr = null;
        if (m0Var != null) {
            j0Var = m0Var.f36471c;
        } else {
            j0Var = null;
        }
        if (j0Var != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        Bundle bundle2 = u0Var.J;
        if (bundle2 != null && (string = bundle2.getString(MediaItemCreator.EXTRA_DRM_OFFLINE_KEY_SET_ID)) != null) {
            bArr = Base64.decode(string, 2);
        }
        return axinomDrmProvider.createSessionManager(str2, str, z6, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p1[] provideRenderersFactory$lambda$0(Context context, Handler handler, i0 i0Var, v vVar, f fVar, p8.b bVar) {
        handler.getClass();
        i0Var.getClass();
        vVar.getClass();
        fVar.getClass();
        bVar.getClass();
        return new t0[]{new t0(context, new c(context), handler, vVar, new i8.m0(context).b())};
    }

    public final h provideDefaultLoadControl() {
        HashMap hashMap = new HashMap();
        hashMap.put(w.f12225d.f12226a, 144179200);
        xq.a aVar = xq.b.f38124b;
        int d10 = (int) xq.b.d(g.n(30, d.SECONDS));
        int d11 = (int) xq.b.d(g.n(2, d.MINUTES));
        d dVar = d.MILLISECONDS;
        int d12 = (int) xq.b.d(g.n(500, dVar));
        int d13 = (int) xq.b.d(g.n(500, dVar));
        h.a(d12, "bufferForPlaybackMs", WebrtcBuildVersion.maint_version, 0);
        h.a(d13, "bufferForPlaybackAfterRebufferMs", WebrtcBuildVersion.maint_version, 0);
        h.a(d10, "minBufferMs", "bufferForPlaybackMs", d12);
        h.a(d10, "minBufferMs", "bufferForPlaybackAfterRebufferMs", d13);
        h.a(d11, "maxBufferMs", "minBufferMs", d10);
        int d14 = (int) xq.b.d(g.n(100, dVar));
        h.a(d14, "backBufferDurationMs", WebrtcBuildVersion.maint_version, 0);
        return new h(new e(), d10, d10, d11, d11, d12, d12, d13, d13, false, d14, hashMap);
    }

    public final s provideDrmSessionManagerProvider(final AxinomDrmProvider axinomDrmProvider) {
        axinomDrmProvider.getClass();
        return new s() { // from class: io.elevenlabs.player.di.b
            @Override // j8.s
            public final r a(r0 r0Var) {
                r provideDrmSessionManagerProvider$lambda$0;
                provideDrmSessionManagerProvider$lambda$0 = PlayerServiceModule.provideDrmSessionManagerProvider$lambda$0(AxinomDrmProvider.this, r0Var);
                return provideDrmSessionManagerProvider$lambda$0;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [io.elevenlabs.player.di.PlayerServiceModule$provideMediaSourceFactory$errorHandlingPolicy$1] */
    public final g0 provideMediaSourceFactory(final ReadsDataSource.Factory readsDataSource, final HlsMediaDataSource.Factory hlsDataSource, final s drmProvider, final MediaItemCreator mediaItemCreator) {
        readsDataSource.getClass();
        hlsDataSource.getClass();
        drmProvider.getClass();
        mediaItemCreator.getClass();
        final ?? r22 = new k() { // from class: io.elevenlabs.player.di.PlayerServiceModule$provideMediaSourceFactory$errorHandlingPolicy$1
            @Override // v8.k
            public i getFallbackSelectionFor(v8.h fallbackOptions, j loadErrorInfo) {
                fallbackOptions.getClass();
                loadErrorInfo.getClass();
                return null;
            }

            @Override // v8.k
            public int getMinimumLoadableRetryCount(int dataType) {
                if (dataType == 1 || dataType == 4) {
                    return 2;
                }
                return 1;
            }

            @Override // v8.k
            public long getRetryDelayMsFor(j loadErrorInfo) {
                loadErrorInfo.getClass();
                for (Throwable th = loadErrorInfo.f35401a; th != null; th = th.getCause()) {
                    if (th instanceof ApiException) {
                        return -9223372036854775807L;
                    }
                }
                return Math.min((1 << (loadErrorInfo.f35402b - 1)) * 1000, 10000L);
            }

            @Override // v8.k
            public /* bridge */ /* synthetic */ void onLoadTaskConcluded(long j4) {
            }
        };
        return new g0(readsDataSource, r22, drmProvider, hlsDataSource, mediaItemCreator) { // from class: io.elevenlabs.player.di.PlayerServiceModule$provideMediaSourceFactory$1
            final /* synthetic */ MediaItemCreator $mediaItemCreator;
            private HlsMediaSource$Factory hlsFactory;
            private b1 progressiveFactory;

            {
                this.$mediaItemCreator = mediaItemCreator;
                b1 b1Var = new b1(readsDataSource, new z8.k());
                gg.b.v(r22, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
                b1Var.f29462d = r22;
                gg.b.v(drmProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
                b1Var.f29461c = drmProvider;
                this.progressiveFactory = b1Var;
                HlsMediaSource$Factory hlsMediaSource$Factory = new HlsMediaSource$Factory(hlsDataSource);
                hlsMediaSource$Factory.f2935j = r22;
                hlsMediaSource$Factory.f2936k = true;
                hlsMediaSource$Factory.f2934i = drmProvider;
                this.hlsFactory = hlsMediaSource$Factory;
            }

            private final r8.j0 createSingleMediaSource(r0 mediaItem) {
                String str;
                Uri uri;
                m0 m0Var = mediaItem.f36579b;
                if (m0Var == null || (uri = m0Var.f36469a) == null || (str = uri.toString()) == null) {
                    str = "";
                }
                if (isHlsUri(str)) {
                    return this.hlsFactory.createMediaSource(mediaItem);
                }
                return this.progressiveFactory.a(mediaItem);
            }

            private final boolean isHlsUri(String uri) {
                if (n.a0(uri, "/manifest-url", false)) {
                    return true;
                }
                String path = Uri.parse(uri).getPath();
                if (path == null) {
                    return false;
                }
                return u.N(path, ".m3u8", false);
            }

            @Override // r8.g0
            public r8.j0 createMediaSource(r0 mediaItem) {
                ArrayList<String> arrayList;
                ArrayList<String> arrayList2;
                ArrayList<String> arrayList3;
                ArrayList arrayList4;
                ArrayList<String> arrayList5;
                ArrayList<String> arrayList6;
                Map<String, String> map;
                ArrayList<String> arrayList7;
                Map<String, byte[]> map2;
                mediaItem.getClass();
                Bundle bundle = mediaItem.f36581d.J;
                ArrayList<String> arrayList8 = null;
                if (bundle != null) {
                    arrayList = bundle.getStringArrayList(MediaItemCreator.EXTRA_CHAPTER_FILE_NUMBERS);
                } else {
                    arrayList = null;
                }
                Bundle bundle2 = mediaItem.f36581d.J;
                if (bundle2 != null) {
                    arrayList2 = bundle2.getStringArrayList(MediaItemCreator.EXTRA_CHAPTER_DURATIONS);
                } else {
                    arrayList2 = null;
                }
                Bundle bundle3 = mediaItem.f36581d.J;
                if (bundle3 != null) {
                    arrayList3 = bundle3.getStringArrayList(MediaItemCreator.EXTRA_CHAPTER_NAMES);
                } else {
                    arrayList3 = null;
                }
                if (arrayList != null && arrayList2 != null && arrayList3 != null && arrayList.size() == arrayList2.size() && arrayList2.size() == arrayList3.size()) {
                    no.g x10 = ig.f.x(arrayList);
                    arrayList4 = new ArrayList(p.a0(x10, 10));
                    Iterator it = x10.iterator();
                    while (((no.f) it).f24561c) {
                        int nextInt = ((y) it).nextInt();
                        String str = arrayList3.get(nextInt);
                        str.getClass();
                        String str2 = str;
                        String str3 = arrayList2.get(nextInt);
                        str3.getClass();
                        Double M = t.M(str3);
                        String str4 = arrayList.get(nextInt);
                        if (m.c(str4, "NULL")) {
                            str4 = null;
                        }
                        arrayList4.add(new Chapter(nextInt, 0L, str2, 0L, false, 0L, M, str4));
                    }
                } else {
                    arrayList4 = null;
                }
                Bundle bundle4 = mediaItem.f36581d.J;
                if (bundle4 != null) {
                    arrayList5 = bundle4.getStringArrayList(MediaItemCreator.EXTRA_CACHED_MANIFEST_KEYS);
                } else {
                    arrayList5 = null;
                }
                Bundle bundle5 = mediaItem.f36581d.J;
                if (bundle5 != null) {
                    arrayList6 = bundle5.getStringArrayList(MediaItemCreator.EXTRA_CACHED_MANIFEST_VALUES);
                } else {
                    arrayList6 = null;
                }
                if (arrayList5 != null && arrayList6 != null && arrayList5.size() == arrayList6.size()) {
                    map = a0.R(o.o1(arrayList5, arrayList6));
                } else {
                    map = tn.u.f33548a;
                }
                Bundle bundle6 = mediaItem.f36581d.J;
                if (bundle6 != null) {
                    arrayList7 = bundle6.getStringArrayList(MediaItemCreator.EXTRA_DRM_KEY_SET_KEYS);
                } else {
                    arrayList7 = null;
                }
                Bundle bundle7 = mediaItem.f36581d.J;
                if (bundle7 != null) {
                    arrayList8 = bundle7.getStringArrayList(MediaItemCreator.EXTRA_DRM_KEY_SET_VALUES);
                }
                if (arrayList7 != null && arrayList8 != null && arrayList7.size() == arrayList8.size()) {
                    ArrayList o12 = o.o1(arrayList7, arrayList8);
                    int H = a0.H(p.a0(o12, 10));
                    if (H < 16) {
                        H = 16;
                    }
                    map2 = new LinkedHashMap<>(H);
                    Iterator it2 = o12.iterator();
                    while (it2.hasNext()) {
                        sn.k kVar = (sn.k) it2.next();
                        map2.put((String) kVar.f31600a, Base64.decode((String) kVar.f31601b, 2));
                    }
                } else {
                    map2 = tn.u.f33548a;
                }
                if (arrayList4 != null && !arrayList4.isEmpty() && arrayList4.size() > 1) {
                    MediaItemCreator mediaItemCreator2 = this.$mediaItemCreator;
                    ArrayList arrayList9 = new ArrayList(p.a0(arrayList4, 10));
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        arrayList9.add(createSingleMediaSource(mediaItemCreator2.createChapterMediaItem(mediaItem, (Chapter) it3.next(), map, map2)));
                    }
                    r8.t tVar = new r8.t(new r8.j0[0]);
                    Iterator it4 = arrayList9.iterator();
                    while (it4.hasNext()) {
                        r8.j0 j0Var = (r8.j0) it4.next();
                        synchronized (tVar) {
                            int size = tVar.f29672k.size();
                            synchronized (tVar) {
                                tVar.z(size, Collections.singletonList(j0Var));
                            }
                        }
                    }
                    return tVar;
                }
                return createSingleMediaSource(mediaItem);
            }

            public int[] getSupportedTypes() {
                return new int[]{4, 2};
            }

            public g0 setDrmSessionManagerProvider(s drmSessionManagerProvider) {
                drmSessionManagerProvider.getClass();
                b1 b1Var = this.progressiveFactory;
                b1Var.getClass();
                b1Var.f29461c = drmSessionManagerProvider;
                this.progressiveFactory = b1Var;
                HlsMediaSource$Factory hlsMediaSource$Factory = this.hlsFactory;
                hlsMediaSource$Factory.getClass();
                hlsMediaSource$Factory.f2934i = drmSessionManagerProvider;
                this.hlsFactory = hlsMediaSource$Factory;
                return this;
            }

            public g0 setLoadErrorHandlingPolicy(k loadErrorHandlingPolicy) {
                loadErrorHandlingPolicy.getClass();
                b1 b1Var = this.progressiveFactory;
                b1Var.getClass();
                b1Var.f29462d = loadErrorHandlingPolicy;
                this.progressiveFactory = b1Var;
                HlsMediaSource$Factory hlsMediaSource$Factory = this.hlsFactory;
                hlsMediaSource$Factory.getClass();
                hlsMediaSource$Factory.f2935j = loadErrorHandlingPolicy;
                this.hlsFactory = hlsMediaSource$Factory;
                return this;
            }

            @Override // r8.g0
            @Deprecated
            public g0 experimentalParseSubtitlesDuringExtraction(boolean z6) {
                return this;
            }

            @Override // r8.g0
            public g0 experimentalSetCodecsToParseWithinGopSampleDependencies(int i10) {
                return this;
            }

            public g0 setCmcdConfigurationFactory(v8.d dVar) {
                return this;
            }

            public g0 setDownloadExecutor(fh.v vVar) {
                return this;
            }

            @Override // r8.g0
            public g0 setSubtitleParserFactory(w9.j jVar) {
                return this;
            }
        };
    }

    public final h1 providePlayer(Context context, s1 renderersFactory, g0 mediaSourceFactory, DynamicLoadControl dynamicLoadControl) {
        context.getClass();
        renderersFactory.getClass();
        mediaSourceFactory.getClass();
        dynamicLoadControl.getClass();
        g8.p pVar = new g8.p(context, new g8.m(renderersFactory, 2), new g8.m(mediaSourceFactory, 3));
        w7.d dVar = new w7.d(1, 0, 1, 3, 0, false, true);
        gg.b.y(!pVar.E);
        pVar.f10849k = dVar;
        pVar.f10850l = true;
        gg.b.y(!pVar.E);
        pVar.f10853o = true;
        gg.b.y(!pVar.E);
        pVar.f10851m = 2;
        pVar.f10852n = true;
        gg.b.y(!pVar.E);
        pVar.f10844f = new g8.m(dynamicLoadControl, 0);
        u8.o oVar = new u8.o(context);
        gg.b.y(!pVar.E);
        pVar.f10843e = new g8.m(oVar, 1);
        gg.b.y(!pVar.E);
        pVar.q = true;
        g8.i0 a10 = pVar.a();
        w8.a aVar = new w8.a();
        q qVar = a10.f10747s;
        qVar.getClass();
        qVar.f12181f.a(aVar);
        return a10;
    }

    public final s1 provideRenderersFactory(final Context context) {
        context.getClass();
        return new s1() { // from class: io.elevenlabs.player.di.a
            @Override // g8.s1
            public final p1[] a(Handler handler, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4) {
                p1[] provideRenderersFactory$lambda$0;
                provideRenderersFactory$lambda$0 = PlayerServiceModule.provideRenderersFactory$lambda$0(context, handler, d0Var, d0Var2, d0Var3, d0Var4);
                return provideRenderersFactory$lambda$0;
            }
        };
    }
}
