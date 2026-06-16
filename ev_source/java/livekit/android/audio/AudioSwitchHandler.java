package io.livekit.android.audio;

import a8.s;
import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import bl.g;
import com.google.protobuf.c6;
import fc.d;
import ho.p;
import io.livekit.android.audio.AudioSwitchHandler$Companion$defaultAudioDeviceChangeListener$2;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.h;
import sn.i;
import tn.o;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 T2\u00020\u0001:\u0001TB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015RD\u0010\u0019\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0016j\u0004\u0018\u0001`\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R2\u0010'\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0&\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0011\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u0010\u0015R\"\u00101\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\"\u0010:\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\"\u0010=\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00102\u001a\u0004\b>\u00104\"\u0004\b?\u00106R\"\u0010@\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00102\u001a\u0004\bA\u00104\"\u0004\bB\u00106R\"\u0010C\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\u0011\u001a\u0004\bD\u0010\u0013\"\u0004\bE\u0010\u0015R\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0013\u0010Q\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\n0\u00178F¢\u0006\u0006\u001a\u0004\bR\u0010*¨\u0006U"}, d2 = {"Lio/livekit/android/audio/AudioSwitchHandler;", "Lio/livekit/android/audio/AudioHandler;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lsn/z;", "start", "()V", "stop", "Lbl/g;", "audioDevice", "selectDevice", "(Lbl/g;)V", "Landroid/content/Context;", "", "loggingEnabled", "Z", "getLoggingEnabled", "()Z", "setLoggingEnabled", "(Z)V", "Lkotlin/Function2;", "", "Lcom/twilio/audioswitch/AudioDeviceChangeListener;", "audioDeviceChangeListener", "Lho/p;", "getAudioDeviceChangeListener", "()Lho/p;", "setAudioDeviceChangeListener", "(Lho/p;)V", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "onAudioFocusChangeListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "getOnAudioFocusChangeListener", "()Landroid/media/AudioManager$OnAudioFocusChangeListener;", "setOnAudioFocusChangeListener", "(Landroid/media/AudioManager$OnAudioFocusChangeListener;)V", "Ljava/lang/Class;", "preferredDeviceList", "Ljava/util/List;", "getPreferredDeviceList", "()Ljava/util/List;", "setPreferredDeviceList", "(Ljava/util/List;)V", "manageAudioFocus", "getManageAudioFocus", "setManageAudioFocus", "", "audioMode", TokenNames.I, "getAudioMode", "()I", "setAudioMode", "(I)V", "focusMode", "getFocusMode", "setFocusMode", "audioStreamType", "getAudioStreamType", "setAudioStreamType", "audioAttributeUsageType", "getAudioAttributeUsageType", "setAudioAttributeUsageType", "audioAttributeContentType", "getAudioAttributeContentType", "setAudioAttributeContentType", "forceHandleAudioRouting", "getForceHandleAudioRouting", "setForceHandleAudioRouting", "Lbl/b;", "audioSwitch", "Lbl/b;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroid/os/HandlerThread;", "thread", "Landroid/os/HandlerThread;", "getSelectedAudioDevice", "()Lbl/g;", "selectedAudioDevice", "getAvailableAudioDevices", "availableAudioDevices", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AudioSwitchHandler implements AudioHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h defaultAudioDeviceChangeListener$delegate;
    private static final h defaultOnAudioFocusChangeListener$delegate;
    private static final h defaultPreferredDeviceList$delegate;
    private int audioAttributeContentType;
    private int audioAttributeUsageType;
    private p audioDeviceChangeListener;
    private int audioMode;
    private int audioStreamType;
    private bl.b audioSwitch;
    private final Context context;
    private int focusMode;
    private boolean forceHandleAudioRouting;
    private Handler handler;
    private boolean loggingEnabled;
    private boolean manageAudioFocus;
    private AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
    private List<? extends Class<? extends g>> preferredDeviceList;
    private HandlerThread thread;

    static {
        AudioSwitchHandler$Companion$defaultOnAudioFocusChangeListener$2 audioSwitchHandler$Companion$defaultOnAudioFocusChangeListener$2 = AudioSwitchHandler$Companion$defaultOnAudioFocusChangeListener$2.INSTANCE;
        i iVar = i.f31598c;
        defaultOnAudioFocusChangeListener$delegate = sn.a.d(iVar, audioSwitchHandler$Companion$defaultOnAudioFocusChangeListener$2);
        defaultAudioDeviceChangeListener$delegate = sn.a.d(iVar, AudioSwitchHandler$Companion$defaultAudioDeviceChangeListener$2.INSTANCE);
        defaultPreferredDeviceList$delegate = sn.a.d(iVar, AudioSwitchHandler$Companion$defaultPreferredDeviceList$2.INSTANCE);
    }

    public AudioSwitchHandler(Context context) {
        context.getClass();
        this.context = context;
        this.manageAudioFocus = true;
        this.audioMode = 3;
        this.focusMode = 1;
        this.audioAttributeUsageType = 2;
        this.audioAttributeContentType = 1;
    }

    public static final void selectDevice$lambda$4(AudioSwitchHandler audioSwitchHandler, g gVar) {
        audioSwitchHandler.getClass();
        bl.b bVar = audioSwitchHandler.audioSwitch;
        if (bVar != null) {
            bVar.f4419j.d("AudioSwitch", "Selected AudioDevice = " + gVar);
            bVar.f4414e = gVar;
            bVar.c(false, gVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bl.b, bl.i] */
    public static final void start$lambda$2(AudioSwitchHandler audioSwitchHandler) {
        audioSwitchHandler.getClass();
        Context context = audioSwitchHandler.context;
        boolean z6 = audioSwitchHandler.loggingEnabled;
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = audioSwitchHandler.onAudioFocusChangeListener;
        if (onAudioFocusChangeListener == null) {
            onAudioFocusChangeListener = INSTANCE.getDefaultOnAudioFocusChangeListener();
        }
        List<? extends Class<? extends g>> list = audioSwitchHandler.preferredDeviceList;
        if (list == null) {
            list = INSTANCE.getDefaultPreferredDeviceList();
        }
        List<? extends Class<? extends g>> list2 = list;
        context.getClass();
        onAudioFocusChangeListener.getClass();
        list2.getClass();
        s sVar = new s(z6, false);
        Object systemService = context.getSystemService("audio");
        if (systemService != null) {
            AudioManager audioManager = (AudioManager) systemService;
            bl.h hVar = new bl.h(context, sVar, audioManager, onAudioFocusChangeListener);
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = onAudioFocusChangeListener;
            el.a aVar = new el.a(audioManager, new Handler(Looper.getMainLooper()));
            ?? bVar = new bl.b(context, onAudioFocusChangeListener2, aVar, sVar, list2, hVar);
            bVar.f4417h = audioSwitchHandler.manageAudioFocus;
            hVar.f4429e = audioSwitchHandler.audioMode;
            hVar.f4430f = audioSwitchHandler.focusMode;
            hVar.f4431g = audioSwitchHandler.audioStreamType;
            hVar.f4432h = audioSwitchHandler.audioAttributeUsageType;
            hVar.f4433i = audioSwitchHandler.audioAttributeContentType;
            bVar.f4418i = audioSwitchHandler.forceHandleAudioRouting;
            audioSwitchHandler.audioSwitch = bVar;
            p pVar = audioSwitchHandler.audioDeviceChangeListener;
            if (pVar == null) {
                pVar = INSTANCE.getDefaultAudioDeviceChangeListener();
            }
            pVar.getClass();
            bVar.f4410a = pVar;
            if (z.h.l(bVar.f4411b) != 2) {
                sVar.d("AudioSwitch", "Redundant start() invocation while already in the started or activated state");
            } else {
                aVar.f8566a = bVar;
                aVar.f8567b.registerAudioDeviceCallback(aVar, aVar.f8568c);
                bVar.f4411b = 1;
            }
            bVar.a();
            return;
        }
        c6.l("null cannot be cast to non-null type android.media.AudioManager");
    }

    public static final void stop$lambda$3(AudioSwitchHandler audioSwitchHandler) {
        audioSwitchHandler.getClass();
        bl.b bVar = audioSwitchHandler.audioSwitch;
        if (bVar != null) {
            el.a aVar = bVar.f4412c;
            int l4 = z.h.l(bVar.f4411b);
            if (l4 != 0) {
                if (l4 != 1) {
                    if (l4 == 2) {
                        bVar.f4419j.d("AudioSwitch", "Redundant stop() invocation while already in the stopped state");
                    }
                } else {
                    if (z.h.l(bVar.f4411b) == 1) {
                        bl.i iVar = (bl.i) bVar;
                        iVar.f4419j.d("AudioSwitch", "onDeactivate");
                        if (iVar.f4415f instanceof bl.c) {
                            iVar.f4420k.f4436l.stopBluetoothSco();
                        }
                        bl.h hVar = bVar.f4420k;
                        AudioManager audioManager = hVar.f4436l;
                        AudioManager audioManager2 = hVar.f4436l;
                        audioManager.setMode(hVar.f4425a);
                        audioManager2.setMicrophoneMute(hVar.f4426b);
                        audioManager2.setSpeakerphoneOn(hVar.f4427c);
                        if (Build.VERSION.SDK_INT >= 26) {
                            AudioFocusRequest audioFocusRequest = hVar.f4428d;
                            if (audioFocusRequest != null) {
                                audioManager.abandonAudioFocusRequest(audioFocusRequest);
                            }
                            hVar.f4428d = null;
                        } else {
                            audioManager.abandonAudioFocus(hVar.f4437m);
                        }
                        bVar.f4411b = 1;
                    }
                    aVar.f8567b.unregisterAudioDeviceCallback(aVar);
                    aVar.f8566a = null;
                    bVar.f4410a = null;
                    bVar.f4411b = 3;
                }
            } else {
                aVar.f8567b.unregisterAudioDeviceCallback(aVar);
                aVar.f8566a = null;
                bVar.f4410a = null;
                bVar.f4411b = 3;
            }
        }
        audioSwitchHandler.audioSwitch = null;
    }

    public final int getAudioAttributeContentType() {
        return this.audioAttributeContentType;
    }

    public final int getAudioAttributeUsageType() {
        return this.audioAttributeUsageType;
    }

    public final p getAudioDeviceChangeListener() {
        return this.audioDeviceChangeListener;
    }

    public final int getAudioMode() {
        return this.audioMode;
    }

    public final int getAudioStreamType() {
        return this.audioStreamType;
    }

    public final List<g> getAvailableAudioDevices() {
        bl.b bVar = this.audioSwitch;
        if (bVar != null) {
            return o.g1(bVar.f4416g);
        }
        return t.f33547a;
    }

    public final int getFocusMode() {
        return this.focusMode;
    }

    public final boolean getForceHandleAudioRouting() {
        return this.forceHandleAudioRouting;
    }

    public final boolean getLoggingEnabled() {
        return this.loggingEnabled;
    }

    public final boolean getManageAudioFocus() {
        return this.manageAudioFocus;
    }

    public final AudioManager.OnAudioFocusChangeListener getOnAudioFocusChangeListener() {
        return this.onAudioFocusChangeListener;
    }

    public final List<Class<? extends g>> getPreferredDeviceList() {
        return this.preferredDeviceList;
    }

    public final g getSelectedAudioDevice() {
        bl.b bVar = this.audioSwitch;
        if (bVar != null) {
            return bVar.f4415f;
        }
        return null;
    }

    public final synchronized void selectDevice(g audioDevice) {
        Looper looper;
        try {
            Looper myLooper = Looper.myLooper();
            Handler handler = this.handler;
            if (handler != null) {
                looper = handler.getLooper();
            } else {
                looper = null;
            }
            if (m.c(myLooper, looper)) {
                bl.b bVar = this.audioSwitch;
                if (bVar != null) {
                    bVar.f4419j.d("AudioSwitch", "Selected AudioDevice = " + audioDevice);
                    bVar.f4414e = audioDevice;
                    bVar.c(false, audioDevice);
                }
            } else {
                Handler handler2 = this.handler;
                if (handler2 != null) {
                    handler2.post(new d(this, audioDevice, 19));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setAudioAttributeContentType(int i10) {
        this.audioAttributeContentType = i10;
    }

    public final void setAudioAttributeUsageType(int i10) {
        this.audioAttributeUsageType = i10;
    }

    public final void setAudioDeviceChangeListener(p pVar) {
        this.audioDeviceChangeListener = pVar;
    }

    public final void setAudioMode(int i10) {
        this.audioMode = i10;
    }

    public final void setAudioStreamType(int i10) {
        this.audioStreamType = i10;
    }

    public final void setFocusMode(int i10) {
        this.focusMode = i10;
    }

    public final void setForceHandleAudioRouting(boolean z6) {
        this.forceHandleAudioRouting = z6;
    }

    public final void setLoggingEnabled(boolean z6) {
        this.loggingEnabled = z6;
    }

    public final void setManageAudioFocus(boolean z6) {
        this.manageAudioFocus = z6;
    }

    public final void setOnAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.onAudioFocusChangeListener = onAudioFocusChangeListener;
    }

    public final void setPreferredDeviceList(List<? extends Class<? extends g>> list) {
        this.preferredDeviceList = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[Catch: all -> 0x000c, TryCatch #0 {all -> 0x000c, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x002b, B:10:0x002f, B:11:0x003b, B:13:0x003f, B:14:0x004f, B:16:0x0053, B:18:0x0057, B:19:0x005a, B:21:0x005e, B:26:0x000e, B:28:0x001e, B:30:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[Catch: all -> 0x000c, TryCatch #0 {all -> 0x000c, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x002b, B:10:0x002f, B:11:0x003b, B:13:0x003f, B:14:0x004f, B:16:0x0053, B:18:0x0057, B:19:0x005a, B:21:0x005e, B:26:0x000e, B:28:0x001e, B:30:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[Catch: all -> 0x000c, TryCatch #0 {all -> 0x000c, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x002b, B:10:0x002f, B:11:0x003b, B:13:0x003f, B:14:0x004f, B:16:0x0053, B:18:0x0057, B:19:0x005a, B:21:0x005e, B:26:0x000e, B:28:0x001e, B:30:0x0024), top: B:2:0x0001 }] */
    @Override // io.livekit.android.audio.AudioHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void start() {
        try {
            if (this.handler == null) {
                if (this.thread != null) {
                }
                if (this.thread == null) {
                    HandlerThread handlerThread = new HandlerThread("AudioSwitchHandlerThread");
                    handlerThread.start();
                    this.thread = handlerThread;
                }
                if (this.handler == null) {
                    HandlerThread handlerThread2 = this.thread;
                    handlerThread2.getClass();
                    this.handler = new Handler(handlerThread2.getLooper());
                }
                if (this.audioSwitch == null) {
                    Handler handler = this.handler;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                    Handler handler2 = this.handler;
                    if (handler2 != null) {
                        handler2.postAtFrontOfQueue(new b(this, 0));
                    }
                }
            }
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.c(null, "AudioSwitchHandler called start multiple times?", new Object[0]);
            }
            if (this.thread == null) {
            }
            if (this.handler == null) {
            }
            if (this.audioSwitch == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.livekit.android.audio.AudioHandler
    public synchronized void stop() {
        try {
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.postAtFrontOfQueue(new b(this, 1));
            }
            HandlerThread handlerThread = this.thread;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            this.handler = null;
            this.thread = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\rR)\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u00100\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lio/livekit/android/audio/AudioSwitchHandler$Companion;", "", "<init>", "()V", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "defaultOnAudioFocusChangeListener$delegate", "Lsn/h;", "getDefaultOnAudioFocusChangeListener", "()Landroid/media/AudioManager$OnAudioFocusChangeListener;", "defaultOnAudioFocusChangeListener", "io/livekit/android/audio/AudioSwitchHandler$Companion$defaultAudioDeviceChangeListener$2$1", "defaultAudioDeviceChangeListener$delegate", "getDefaultAudioDeviceChangeListener", "()Lio/livekit/android/audio/AudioSwitchHandler$Companion$defaultAudioDeviceChangeListener$2$1;", "defaultAudioDeviceChangeListener", "", "Ljava/lang/Class;", "Lbl/g;", "defaultPreferredDeviceList$delegate", "getDefaultPreferredDeviceList", "()Ljava/util/List;", "defaultPreferredDeviceList", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final AudioSwitchHandler$Companion$defaultAudioDeviceChangeListener$2.AnonymousClass1 getDefaultAudioDeviceChangeListener() {
            return (AudioSwitchHandler$Companion$defaultAudioDeviceChangeListener$2.AnonymousClass1) AudioSwitchHandler.defaultAudioDeviceChangeListener$delegate.getValue();
        }

        public final AudioManager.OnAudioFocusChangeListener getDefaultOnAudioFocusChangeListener() {
            return (AudioManager.OnAudioFocusChangeListener) AudioSwitchHandler.defaultOnAudioFocusChangeListener$delegate.getValue();
        }

        public final List<Class<? extends g>> getDefaultPreferredDeviceList() {
            return (List) AudioSwitchHandler.defaultPreferredDeviceList$delegate.getValue();
        }

        private Companion() {
        }
    }
}
