package dahua_dp.a16_State.b;

public class Work {
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean isWorkFinished() {
        return isWorkFinished;
    }

    public void setWorkFinished(boolean workFinished) {
        isWorkFinished = workFinished;
    }

    private  int hours; //当前时间
    private boolean isWorkFinished;//工作是否完成

    public WorkState getWorkState() {
        return workState;
    }

    public void setWorkState(WorkState workState) {
        this.workState = workState;
    }

    //父类对象指向子类实例.
    private WorkState workState = new ForenoonState(); //初始状态为早上

    public void writePrograms() {
//        if (hours < 12) {
//            System.out.println("当前时间:" + getHours() + " "  +  " 早上精神百倍👌🏻");
//        } else if (hours < 13) {
//            System.out.println("当前时间:" + getHours() + " "  +  " 中午饿了 犯困.🍚 ");
//        } else if (hours < 17) {
//            System.out.println("当前时间:" + getHours() + " "  +  " 下午状态还好 ☕️ ");
//        } else { //过了 5 点 以后 也就是 18点 决定是否加班.
//            if (isWorkFinished) {
//                System.out.println("当前时间:" + getHours() + " "  +  " 下班了开心😄");
//            }else  {
//                if (hours < 20) {
//                    System.out.println("当前时间:" + getHours() + " "  +  " 晚上8点以前勉强加班");
//                } else if (hours < 22) {
//                    System.out.println("当前时间:" + getHours() + " " + "开始犯困了");
//                }else {
//                    System.out.println("当前时间:" + getHours() + " " + "回家睡觉 😴");
//                }
//            }
//        }

        // 可以看到 把每一种的 if-else 判断封装到了 对应的 每一个状态类中.
        workState.writePrograms(this); ///workState 也是多态的体现.

    }


}
