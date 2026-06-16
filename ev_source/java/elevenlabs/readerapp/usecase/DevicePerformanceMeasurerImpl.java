package io.elevenlabs.readerapp.usecase;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import io.elevenlabs.domain.usecase.DevicePerformanceClass;
import io.elevenlabs.domain.usecase.DevicePerformanceMeasurer;
import io.elevenlabs.domain.usecase.DevicePerformanceResult;
import java.io.File;
import java.io.FileFilter;
import java.io.RandomAccessFile;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import sn.l;
import sn.m;
import tn.a0;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/readerapp/usecase/DevicePerformanceMeasurerImpl;", "Lio/elevenlabs/domain/usecase/DevicePerformanceMeasurer;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cachedResult", "Ljava/util/concurrent/atomic/AtomicReference;", "Lio/elevenlabs/domain/usecase/DevicePerformanceResult;", "measure", "measureActual", "isLowEndSoc", "", "getTotalMemory", "", "activityManager", "Landroid/app/ActivityManager;", "getNumberOfCores", "", "getMaxCpuFrequency", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DevicePerformanceMeasurerImpl implements DevicePerformanceMeasurer {
    public static final int $stable = 8;
    private final AtomicReference<DevicePerformanceResult> cachedResult;
    private final Context context;

    public DevicePerformanceMeasurerImpl(Context context) {
        context.getClass();
        this.context = context;
        this.cachedResult = new AtomicReference<>(null);
    }

    private final int getMaxCpuFrequency() {
        try {
            int numberOfCores = getNumberOfCores();
            int i10 = -1;
            for (int i11 = 0; i11 < numberOfCores; i11++) {
                String str = "/sys/devices/system/cpu/cpu" + i11 + "/cpufreq/cpuinfo_max_freq";
                if (new File(str).exists()) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
                    try {
                        String readLine = randomAccessFile.readLine();
                        readLine.getClass();
                        int parseInt = Integer.parseInt(readLine);
                        if (parseInt > i10) {
                            i10 = parseInt;
                        }
                    } catch (Throwable unused) {
                    }
                    randomAccessFile.close();
                }
            }
            return i10;
        } catch (Exception unused2) {
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.FileFilter, java.lang.Object] */
    private final int getNumberOfCores() {
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles((FileFilter) new Object());
            if (listFiles != null) {
                return listFiles.length;
            }
            return Runtime.getRuntime().availableProcessors();
        } catch (Exception unused) {
            return Runtime.getRuntime().availableProcessors();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getNumberOfCores$lambda$0(File file) {
        return Pattern.matches("cpu[0-9]+", file.getName());
    }

    private final long getTotalMemory(ActivityManager activityManager) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    private final boolean isLowEndSoc() {
        Set set;
        String str = Build.HARDWARE;
        str.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        String str2 = Build.BOARD;
        str2.getClass();
        String lowerCase2 = str2.toLowerCase(locale);
        lowerCase2.getClass();
        set = DevicePerformanceMeasurerImplKt.LOW_PERFORMANCE_SOC_MODELS;
        Set<String> set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            for (String str3 : set2) {
                if (n.a0(lowerCase, str3, false) || n.a0(lowerCase2, str3, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final DevicePerformanceResult measureActual() {
        int i10;
        DevicePerformanceClass devicePerformanceClass;
        if (isLowEndSoc()) {
            DevicePerformanceClass devicePerformanceClass2 = DevicePerformanceClass.Low;
            k kVar = new k("verdict", "low_end_soc");
            String str = Build.HARDWARE;
            str.getClass();
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            k kVar2 = new k("model", lowerCase);
            String str2 = Build.BOARD;
            str2.getClass();
            String lowerCase2 = str2.toLowerCase(locale);
            lowerCase2.getClass();
            DevicePerformanceResult devicePerformanceResult = new DevicePerformanceResult(devicePerformanceClass2, a0.J(kVar, kVar2, new k("board", lowerCase2)));
            this.cachedResult.set(devicePerformanceResult);
            return devicePerformanceResult;
        }
        Object systemService = this.context.getSystemService("activity");
        systemService.getClass();
        ActivityManager activityManager = (ActivityManager) systemService;
        long totalMemory = getTotalMemory(activityManager);
        int numberOfCores = getNumberOfCores();
        int maxCpuFrequency = getMaxCpuFrequency();
        int memoryClass = activityManager.getMemoryClass();
        if (0 <= totalMemory && totalMemory < 2000000001) {
            i10 = -1;
        } else if (4000000001L <= totalMemory && totalMemory < 6000000001L) {
            i10 = 1;
        } else if (6000000001L <= totalMemory && totalMemory <= Long.MAX_VALUE) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        if (memoryClass >= 0 && memoryClass < 193) {
            i10--;
        } else if (193 <= memoryClass && memoryClass < 512) {
            i10++;
        } else if (512 <= memoryClass && memoryClass <= Integer.MAX_VALUE) {
            i10 += 2;
        }
        if (1 <= numberOfCores && numberOfCores < 4) {
            i10--;
        } else if (4 <= numberOfCores && numberOfCores < 8) {
            i10++;
        } else if (8 <= numberOfCores && numberOfCores <= Integer.MAX_VALUE) {
            i10 += 2;
        }
        if (maxCpuFrequency >= 0 && maxCpuFrequency < 1800001) {
            i10--;
        } else if (2200001 <= maxCpuFrequency && maxCpuFrequency < 2800001) {
            i10++;
        } else if (2800001 <= maxCpuFrequency && maxCpuFrequency <= Integer.MAX_VALUE) {
            i10 += 2;
        }
        if (i10 <= 1) {
            devicePerformanceClass = DevicePerformanceClass.Low;
        } else if (2 <= i10 && i10 < 6) {
            devicePerformanceClass = DevicePerformanceClass.Average;
        } else {
            devicePerformanceClass = DevicePerformanceClass.High;
        }
        k kVar3 = new k("verdict", "scoring");
        k kVar4 = new k(FirebaseAnalytics.Param.SCORE, Integer.valueOf(i10));
        k kVar5 = new k("total_memory_bytes", Long.valueOf(totalMemory));
        k kVar6 = new k("memory_class_mb", Integer.valueOf(memoryClass));
        k kVar7 = new k("cpu_cores", Integer.valueOf(numberOfCores));
        k kVar8 = new k("max_cpu_frequency_khz", Integer.valueOf(maxCpuFrequency));
        String str3 = Build.HARDWARE;
        str3.getClass();
        Locale locale2 = Locale.ROOT;
        String lowerCase3 = str3.toLowerCase(locale2);
        lowerCase3.getClass();
        k kVar9 = new k("model", lowerCase3);
        String str4 = Build.BOARD;
        str4.getClass();
        String lowerCase4 = str4.toLowerCase(locale2);
        lowerCase4.getClass();
        return new DevicePerformanceResult(devicePerformanceClass, a0.J(kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, new k("board", lowerCase4)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [sn.l] */
    @Override // io.elevenlabs.domain.usecase.DevicePerformanceMeasurer
    public DevicePerformanceResult measure() {
        DevicePerformanceResult lVar;
        DevicePerformanceResult devicePerformanceResult = this.cachedResult.get();
        if (devicePerformanceResult == null) {
            try {
                lVar = measureActual();
                this.cachedResult.set(lVar);
            } catch (Throwable th) {
                lVar = new l(th);
            }
            Throwable a10 = m.a(lVar);
            if (a10 == null) {
                return lVar;
            }
            return new DevicePerformanceResult(DevicePerformanceClass.Low, a0.J(new k("verdict", "check_error"), new k(DiagnosticsTracker.ERROR_MESSAGE_KEY, String.valueOf(a10))));
        }
        return devicePerformanceResult;
    }
}
