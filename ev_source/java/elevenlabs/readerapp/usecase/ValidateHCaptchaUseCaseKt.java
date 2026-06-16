package io.elevenlabs.readerapp.usecase;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.protobuf.c6;
import com.hcaptcha.sdk.HCaptchaConfig;
import com.hcaptcha.sdk.HCaptchaSize;
import com.hcaptcha.sdk.HCaptchaTheme;
import fr.n;
import fr.z;
import ho.l;
import io.elevenlabs.readerapp.usecase.ValidateHCaptchaResult;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sj.d;
import sj.i;
import sj.j;
import sj.o;
import sj.s;
import wn.c;
import wn.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroid/app/Activity;", "activity", "", "siteKey", "Lfr/z;", "mainDispatcher", "Lcom/hcaptcha/sdk/HCaptchaSize;", "size", "Lcom/hcaptcha/sdk/HCaptchaTheme;", "theme", "", "loading", "Lio/elevenlabs/readerapp/usecase/ValidateHCaptchaResult;", "validateHCaptcha", "(Landroid/app/Activity;Ljava/lang/String;Lfr/z;Lcom/hcaptcha/sdk/HCaptchaSize;Lcom/hcaptcha/sdk/HCaptchaTheme;ZLwn/c;)Ljava/lang/Object;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ValidateHCaptchaUseCaseKt {
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, fe.o] */
    /* JADX WARN: Type inference failed for: r3v0, types: [sj.l, java.lang.Object] */
    public static final Object validateHCaptcha(Activity activity, String str, final z zVar, HCaptchaSize hCaptchaSize, HCaptchaTheme hCaptchaTheme, boolean z6, c<? super ValidateHCaptchaResult> cVar) {
        ApplicationInfo applicationInfo;
        PackageManager.ApplicationInfoFlags of2;
        final n nVar = new n(1, gg.b.V(cVar));
        nVar.t();
        if (activity != null) {
            ?? obj = new Object();
            ?? obj2 = new Object();
            obj2.f31572a = obj;
            final sj.b bVar = new sj.b(activity, obj2);
            d builder = HCaptchaConfig.builder();
            if (str != null) {
                builder.f31527a = str;
                builder.f31543r = hCaptchaSize;
                builder.q = true;
                builder.f31547v = hCaptchaTheme;
                builder.f31546u = true;
                builder.f31531e = Boolean.valueOf(z6);
                builder.f31530d = true;
                bVar.a(builder.a());
                final l lVar = new l() { // from class: io.elevenlabs.readerapp.usecase.ValidateHCaptchaUseCaseKt$validateHCaptcha$2$successListener$1
                    public final void invoke(o oVar) {
                        oVar.getClass();
                        try {
                            fr.l lVar2 = fr.l.this;
                            String str2 = oVar.f31578a;
                            str2.getClass();
                            lVar2.resumeWith(new ValidateHCaptchaResult.Success(str2));
                        } finally {
                            ValidateHCaptchaUseCaseKt.validateHCaptcha$lambda$0$cleanup(bVar);
                        }
                    }

                    @Override // ho.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                        invoke((o) obj3);
                        return sn.z.f31622a;
                    }
                };
                final l lVar2 = new l() { // from class: io.elevenlabs.readerapp.usecase.ValidateHCaptchaUseCaseKt$validateHCaptcha$2$failureListener$1
                    public final void invoke(j jVar) {
                        jVar.getClass();
                        try {
                            fr.l.this.resumeWith(new ValidateHCaptchaResult.Error(jVar));
                        } finally {
                            ValidateHCaptchaUseCaseKt.validateHCaptcha$lambda$0$cleanup(bVar);
                        }
                    }

                    @Override // ho.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                        invoke((j) obj3);
                        return sn.z.f31622a;
                    }
                };
                bVar.f31520c.add(new tj.b(lVar) { // from class: io.elevenlabs.readerapp.usecase.ValidateHCaptchaUseCaseKt$sam$com_hcaptcha_sdk_tasks_OnSuccessListener$0
                    private final /* synthetic */ l function;

                    {
                        lVar.getClass();
                        this.function = lVar;
                    }

                    @Override // tj.b
                    public final /* synthetic */ void onSuccess(Object obj3) {
                        this.function.invoke(obj3);
                    }
                });
                bVar.b();
                bVar.f31521d.add(new tj.a(lVar2) { // from class: io.elevenlabs.readerapp.usecase.ValidateHCaptchaUseCaseKt$sam$com_hcaptcha_sdk_tasks_OnFailureListener$0
                    private final /* synthetic */ l function;

                    {
                        lVar2.getClass();
                        this.function = lVar2;
                    }

                    @Override // tj.a
                    public final /* synthetic */ void onFailure(j jVar) {
                        this.function.invoke(jVar);
                    }
                });
                bVar.b();
                s sVar = bVar.f31525h;
                Activity activity2 = bVar.f31524g;
                if (sVar == null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 33) {
                            PackageManager packageManager = activity2.getPackageManager();
                            String packageName = activity2.getPackageName();
                            of2 = PackageManager.ApplicationInfoFlags.of(128L);
                            applicationInfo = packageManager.getApplicationInfo(packageName, of2);
                        } else {
                            applicationInfo = activity2.getPackageManager().getApplicationInfo(activity2.getPackageName(), 128);
                        }
                        String string = applicationInfo.metaData.getString("com.hcaptcha.sdk.site-key");
                        if (string != null) {
                            d builder2 = HCaptchaConfig.builder();
                            builder2.f31527a = string;
                            bVar.a(builder2.a());
                        } else {
                            c6.x("The site-key is missing. You can pass it by adding com.hcaptcha.sdk.site-key as meta-data to AndroidManifest.xml or as an argument for setup/verifyWithHCaptcha methods.");
                            return null;
                        }
                    } catch (PackageManager.NameNotFoundException e10) {
                        com.google.android.recaptcha.internal.a.k(e10);
                        return null;
                    }
                }
                bVar.f31523f.removeCallbacksAndMessages(null);
                s sVar2 = bVar.f31525h;
                if (sVar2 == null) {
                    bVar.f31519b = new j(i.ERROR, null);
                    bVar.b();
                } else {
                    sVar2.d(activity2);
                }
                nVar.e(new l() { // from class: io.elevenlabs.readerapp.usecase.ValidateHCaptchaUseCaseKt$validateHCaptcha$2$1
                    public final void invoke(Throwable th) {
                        z zVar2 = z.this;
                        h context = nVar.getContext();
                        final sj.b bVar2 = bVar;
                        zVar2.L(context, new Runnable() { // from class: io.elevenlabs.readerapp.usecase.ValidateHCaptchaUseCaseKt$validateHCaptcha$2$1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ValidateHCaptchaUseCaseKt.validateHCaptcha$lambda$0$cleanup(sj.b.this);
                            }
                        });
                    }

                    @Override // ho.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                        invoke((Throwable) obj3);
                        return sn.z.f31622a;
                    }
                });
                return nVar.s();
            }
            builder.getClass();
            c6.l("siteKey is marked non-null but is null");
            return null;
        }
        c6.l("activity is marked non-null but is null");
        return null;
    }

    public static /* synthetic */ Object validateHCaptcha$default(Activity activity, String str, z zVar, HCaptchaSize hCaptchaSize, HCaptchaTheme hCaptchaTheme, boolean z6, c cVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            hCaptchaSize = HCaptchaSize.NORMAL;
        }
        HCaptchaSize hCaptchaSize2 = hCaptchaSize;
        if ((i10 & 16) != 0) {
            hCaptchaTheme = HCaptchaTheme.LIGHT;
        }
        HCaptchaTheme hCaptchaTheme2 = hCaptchaTheme;
        if ((i10 & 32) != 0) {
            z6 = true;
        }
        return validateHCaptcha(activity, str, zVar, hCaptchaSize2, hCaptchaTheme2, z6, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateHCaptcha$lambda$0$cleanup(sj.b bVar) {
        bVar.f31520c.clear();
        bVar.f31521d.clear();
        bVar.f31522e.clear();
        s sVar = bVar.f31525h;
        if (sVar != null) {
            sVar.a();
            bVar.f31525h = null;
        }
    }
}
