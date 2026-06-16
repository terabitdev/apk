package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import fr.z;
import io.elevenlabs.domain.ApplicationCoroutineScope;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import java.io.File;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignAudioStorage;", "", "Landroid/content/Context;", "context", "Lfr/d0;", "scope", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Landroid/content/Context;Lfr/d0;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Logger;)V", "", "sessionId", "Ljava/io/File;", "getSessionDirectory", "(Ljava/lang/String;)Ljava/io/File;", "voiceId", "audioBase64", "Landroid/net/Uri;", "savePreviewAudio", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lsn/z;", "cleanupSessionFiles", "(Ljava/lang/String;)V", "Landroid/content/Context;", "Lfr/d0;", "Lio/elevenlabs/domain/DispatcherFactory;", "Lio/elevenlabs/domain/Logger;", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoiceDesignAudioStorage {

    @Deprecated
    public static final String CACHE_SUBDIRECTORY = "voice_design_previews";

    @Deprecated
    public static final String TAG = "VoiceDesignAudioStorage";
    private final Context context;
    private final DispatcherFactory dispatcherFactory;
    private final Logger logger;
    private final d0 scope;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public VoiceDesignAudioStorage(Context context, @ApplicationCoroutineScope d0 d0Var, DispatcherFactory dispatcherFactory, Logger logger) {
        context.getClass();
        d0Var.getClass();
        dispatcherFactory.getClass();
        logger.getClass();
        this.context = context;
        this.scope = d0Var;
        this.dispatcherFactory = dispatcherFactory;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getSessionDirectory(String sessionId) {
        return new File(this.context.getCacheDir(), defpackage.f.i("voice_design_previews/", sessionId));
    }

    public final void cleanupSessionFiles(String sessionId) {
        sessionId.getClass();
        g0.D(this.scope, this.dispatcherFactory.getIo(), null, new VoiceDesignAudioStorage$cleanupSessionFiles$1(this, sessionId, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object savePreviewAudio(String str, String str2, String str3, wn.c<? super Uri> cVar) {
        VoiceDesignAudioStorage$savePreviewAudio$1 voiceDesignAudioStorage$savePreviewAudio$1;
        int i10;
        File file;
        if (cVar instanceof VoiceDesignAudioStorage$savePreviewAudio$1) {
            voiceDesignAudioStorage$savePreviewAudio$1 = (VoiceDesignAudioStorage$savePreviewAudio$1) cVar;
            int i11 = voiceDesignAudioStorage$savePreviewAudio$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                voiceDesignAudioStorage$savePreviewAudio$1.label = i11 - Integer.MIN_VALUE;
                Object obj = voiceDesignAudioStorage$savePreviewAudio$1.result;
                i10 = voiceDesignAudioStorage$savePreviewAudio$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        File file2 = (File) voiceDesignAudioStorage$savePreviewAudio$1.L$4;
                        str2 = (String) voiceDesignAudioStorage$savePreviewAudio$1.L$1;
                        String str4 = (String) voiceDesignAudioStorage$savePreviewAudio$1.L$0;
                        sn.a.g(obj);
                        file = file2;
                        str = str4;
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    File sessionDirectory = getSessionDirectory(str);
                    if (!sessionDirectory.exists()) {
                        sessionDirectory.mkdirs();
                    }
                    file = new File(sessionDirectory, defpackage.f.B(str2, ".mp3"));
                    byte[] decode = Base64.decode(str3, 0);
                    z io2 = this.dispatcherFactory.getIo();
                    VoiceDesignAudioStorage$savePreviewAudio$2 voiceDesignAudioStorage$savePreviewAudio$2 = new VoiceDesignAudioStorage$savePreviewAudio$2(file, decode, null);
                    voiceDesignAudioStorage$savePreviewAudio$1.L$0 = str;
                    voiceDesignAudioStorage$savePreviewAudio$1.L$1 = str2;
                    voiceDesignAudioStorage$savePreviewAudio$1.L$2 = null;
                    voiceDesignAudioStorage$savePreviewAudio$1.L$3 = null;
                    voiceDesignAudioStorage$savePreviewAudio$1.L$4 = file;
                    voiceDesignAudioStorage$savePreviewAudio$1.L$5 = null;
                    voiceDesignAudioStorage$savePreviewAudio$1.label = 1;
                    Object Q = g0.Q(io2, voiceDesignAudioStorage$savePreviewAudio$2, voiceDesignAudioStorage$savePreviewAudio$1);
                    xn.a aVar = xn.a.f37986a;
                    if (Q == aVar) {
                        return aVar;
                    }
                }
                this.logger.log(TAG, defpackage.f.k("Saved preview audio for voice ", str2, " in session ", str));
                Uri fromFile = Uri.fromFile(file);
                fromFile.getClass();
                return fromFile;
            }
        }
        voiceDesignAudioStorage$savePreviewAudio$1 = new VoiceDesignAudioStorage$savePreviewAudio$1(this, cVar);
        Object obj2 = voiceDesignAudioStorage$savePreviewAudio$1.result;
        i10 = voiceDesignAudioStorage$savePreviewAudio$1.label;
        if (i10 == 0) {
        }
        this.logger.log(TAG, defpackage.f.k("Saved preview audio for voice ", str2, " in session ", str));
        Uri fromFile2 = Uri.fromFile(file);
        fromFile2.getClass();
        return fromFile2;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignAudioStorage$Companion;", "", "<init>", "()V", "TAG", "", "CACHE_SUBDIRECTORY", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        private Companion() {
        }
    }
}
